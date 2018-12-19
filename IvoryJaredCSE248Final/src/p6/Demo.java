package p6;


public class Demo {
	private char[] characters = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N' ,'O' ,'P' ,'Q' ,'R' ,'S' ,'T' ,'U' ,'V' ,'W' ,'X', 'Y', 'Z'};
	
	public static void main(String[] args) throws InterruptedException {
		Demo app = new Demo();
		app.print();
	}
	
	public void print() throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for(int i = 0; i<= 100; i++) {
				System.out.println(i);
			}
		});
		
		
		Thread t2 = new Thread(() -> {
			for(char c: characters) {
				System.out.println(c);
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();;
		
		System.out.println("The End");
	}
	
}
