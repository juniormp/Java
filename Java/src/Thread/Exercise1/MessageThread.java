package Thread.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class MessageThread implements Runnable {

	@Override
	public void run() {

		sendMessageList();
		
	}

	private void sendMessageList() {

		List<Integer> list = new ArrayList<>();

		for (int j = 0; j < 20; j++)
			list.add(j);

		try {

			for (int i = 0; i < list.size(); i++) {
				System.out.println("Thread1: " + list.get(i));
				Thread.sleep(20000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
