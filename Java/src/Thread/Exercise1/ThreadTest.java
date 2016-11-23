package Thread.Exercise1;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		MessageThread messageThread = new MessageThread();
		DateThread checkDateThread = new DateThread();

		Thread threadOne = new Thread(messageThread);
		Thread threadTwo = new Thread(checkDateThread);

		threadOne.start();
		threadTwo.start();
	
		while(true){
			try {
				Thread.sleep(5000);
				
				System.out.println("Status thread1: " + threadOne.getState());
				System.out.println("Status thread2: " + threadTwo.getState());
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}

}
