package p1;

public class Runner extends Thread{
	
	
	@Override
	public void run() {
		System.out.println("Hello World!");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	};
}
