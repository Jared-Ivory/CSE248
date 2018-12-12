
package p6;

public class SyncApp {
	private int count;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SyncApp app = new SyncApp();
		app.doWork();
	}
	
	public void doWork() throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				increment();
			}
		});
		
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 1000; i++) {
				increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("T1 and T2 are finished!");
		
		System.out.println("Total count is: " + count);
	}
	
	/** This method can only be used one at a time**/
	public synchronized void increment() {
		count++;
	}

}
