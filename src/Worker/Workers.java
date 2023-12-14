package Worker;
import java.util.*;

public class Workers {
	public static void main(String[] args) {
		List<Worker> workers = new ArrayList();
		
		workers.add(new DailyWorker("Alice", 50, 3));
        workers.add(new SalariedWorker("Bob", 45));
        workers.add(new DailyWorker("Charlie", 40, 5));
        workers.add(new SalariedWorker("David", 38));
        
        for(Worker w:workers) {
        	w.pay();
        }
        
        Collections.sort(workers);
        
        for(Worker w:workers) {
        	System.out.println(w);
        }
        
	}
}
