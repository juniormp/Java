package thread.exercise1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateThread implements Runnable {

	@Override
	public void run() {
		
		sendMessageDate();
		
	}

	private void sendMessageDate() {

		LocalDateTime localDate = LocalDateTime.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

		try {
			while (true) {

				localDate = LocalDateTime.now();
				System.out.println("Thread2: " + localDate.format(dateFormat));

				Thread.sleep(10000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	

}
