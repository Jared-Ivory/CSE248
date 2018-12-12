package p1;

public class Demo {
	
	/** Main Thread
	 * @throws InterruptedException **/
	public static void main(String[] args) throws InterruptedException {
		Runner r1 = new Runner();
		/** Starts secondary thread. **/
		r1.start();
		
		/** Interrupts main thread**/
		//Thread.sleep(1000);
		
		/** Allow runner to finish first before continue**/
		r1.join();
		
		System.out.println("End of main method");
		System.out.println("---" + Thread.currentThread().getName()+ "---");
	}
}
