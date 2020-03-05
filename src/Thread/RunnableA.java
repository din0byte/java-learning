package Thread;

public class RunnableA implements Runnable {
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println("A");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}