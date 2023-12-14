package StudentSort;

public class Employee {
	int empId;
	String name;
	static int idInit = 0;
	
	Employee(String name){
		this.empId = idInit+1;
		this.name = name;
		idInit++;
	}
	
	public String toString() {
		return(empId + " "+ name);
	}
	
	public static void main(String[] arg) {
		Employee e1 = new Employee("Ugyen");
		Employee e2 = new Employee("Jigme");
		
		System.out.print(e1);
		System.out.print(e2);
	}
}
