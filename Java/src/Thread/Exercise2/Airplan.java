package Thread.Exercise2;

public class Airplan extends Thread {

	private String name;
	private Airport airport;


	@Override
	public synchronized void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println("B: " + i);
			
		}
		
		try {
			currentThread().wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 21; i < 40; i++) {
			System.out.println("B: " + i);
			
		}
		
	}



}
