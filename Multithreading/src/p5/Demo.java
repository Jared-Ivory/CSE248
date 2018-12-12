package p5;

public class Demo {
	
	/** Function programming method.
	 * @throws InterruptedException **/
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->{
			System.out.println("Hello world.");
		});
		t1.start();
		
		/* if you wanted to insure that a thread finished before the
		 * continuation of the thread you are in you are to "join" the thread
		 * inside the thread you are interrupting. */
		t1.join();
		
		System.out.println("End of main.");
	}
	

}
