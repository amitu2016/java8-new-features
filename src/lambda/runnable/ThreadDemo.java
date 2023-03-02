package lambda.runnable;

public class ThreadDemo {

	public static void main(String[] args) {

		Runnable r = () -> {	
			for (int i = 0; i < 10; i++) {
				System.out.println("Inside Runnable");
			}
		};
		
		Thread t = new Thread(r);
				
		for (int i = 0; i < 10; i++) {
			System.out.println("Inside main");
		}	
		t.start();
		
	}

}
