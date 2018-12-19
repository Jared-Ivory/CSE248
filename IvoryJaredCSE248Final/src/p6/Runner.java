package p6;

public class Runner extends Thread{
	private char[] characters = {'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N' ,'O' ,'P' ,'Q' ,'R' ,'S' ,'T' ,'U' ,'V' ,'W' ,'X', 'Y', 'Z'};
	
	@Override
	public void run() {
		for(char c: characters) {
			System.out.println(c);
		}
	};
}