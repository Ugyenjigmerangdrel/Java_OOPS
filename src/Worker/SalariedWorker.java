package Worker;

public class SalariedWorker extends Worker{
	int weekWage;
	
	public SalariedWorker(String name, int weekWage) {
		super(name, 0);
		this.weekWage = weekWage;
	}
	
	public void pay() {
		this.salary = weekWage*40;
	}

	@Override
	public String toString() {
		return "SalariedWorker [weekWage=" + weekWage + ", name=" + name + ", salary=" + salary + "]";
	}

	
}
