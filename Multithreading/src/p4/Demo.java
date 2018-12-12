package p4;

public class Demo {
	
	
	/** Anonymous class way.**/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread  t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello World!");
			}
			
		});
		t1.start();
		System.out.println("end of main.");
		
	}

}
