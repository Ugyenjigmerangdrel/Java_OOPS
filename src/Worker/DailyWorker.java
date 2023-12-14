package Worker;

public class DailyWorker extends Worker{
	int dailyWage;
	int numberofdays;
	
	public DailyWorker(String name, int dailyWage, int numberofdays) {
		super(name, 0);
		this.dailyWage = dailyWage;
		this.numberofdays = numberofdays;
	}
	
	public void pay() {
		this.salary = dailyWage*numberofdays;
	}

	@Override
	public String toString() {
		return "DailyWorker [dailyWage=" + dailyWage + ", numberofdays=" + numberofdays + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
	
}
