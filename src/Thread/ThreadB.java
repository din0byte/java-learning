package Thread;

public class ThreadB extends Thread{
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println("B");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
