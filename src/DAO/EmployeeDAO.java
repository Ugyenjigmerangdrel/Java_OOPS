package DAO;
import java.sql.*;
import DAO.Employee;

public class EmployeeDAO {

	private String INSERT_SQL = "INSERT INTO employees VALUES (?,?,?)";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/NU";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "root";
	
	public void insertEmployee(Employee employee) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
			
			pstmt = con.prepareStatement(INSERT_SQL);
			
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setInt(3, employee.getSalary());
			
			int record = pstmt.executeUpdate();
			
			if (record > 0) {
				System.out.print("Record Inserted Successfully");
			} else {
				System.out.print("Record Insertion Failed");
			}
			
			con.close();
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(1, "Ugyen", 40000);
		
		EmployeeDAO edao = new EmployeeDAO();
		
		edao.insertEmployee(emp1);
	}
}
