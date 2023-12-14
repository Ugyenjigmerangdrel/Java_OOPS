package DAO;

import java.sql.*;


public class EmpDAO {
	protected String JDBC_URL = "jdbc:mysql://localhost:3306/NU";
	protected String JDBC_USER = "root";
	protected String JDBC_PWD = "root";
	private String SELECT_EMP = "SELECT * FROM employees WHERE id= ?; ";
	public Employee selectEmployee(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Employee emp = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PWD);
			
			pstmt = con.prepareStatement(SELECT_EMP);
			pstmt.setInt(1, id);
			System.out.println(pstmt);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int eid = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				emp = new Employee(eid, name, salary);
			}
			
			return emp;
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return emp;
	}
	
	public static void main(String[] args) {
		
		EmpDAO edao = new EmpDAO();
		
		Employee emp1 = edao.selectEmployee(1);
		
		System.out.print(emp1);
		
	}
}
