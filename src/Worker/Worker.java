package Worker;

public class Worker implements Comparable<Worker>{
	String name;
	int salary;
	
	public Worker(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public int compareTo(Worker worker2) {
		return Integer.compare(this.salary, worker2.salary);
	}
	
	public void pay() {
		
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return name;
	}
}
