package Threading;

public class MultiThreading {
	public static void main(String[] args) {
		AdderThread at = new AdderThread();
		PrintThread pt = new PrintThread();
		
		Thread tat = new Thread(at);
		Thread tpt = new Thread(pt);
		
		tat.start();
		
		try {
			tat.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		tpt.start();
	}
}
