package Threading;

public class PrintThread implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("This is line: "+1);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
