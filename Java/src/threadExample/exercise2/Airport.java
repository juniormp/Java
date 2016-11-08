package threadExample.exercise2;

import java.util.Random;

public class Airport extends Thread {

	private String name;
	private boolean available;
	private boolean status;

	@Override
	public void run() {

		System.out.println(this.name + " START");

		try {

			while (true){
				
				changeStatusTrack();
				waitAvailableTrack();
			}
				

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Airport(String name) {
		super();
		this.name = name;
	}

	public synchronized void waitAvailableTrack() throws InterruptedException {

		if (this.status) {

			System.out.println(this.name + " Track Available");

		} else {
			System.out.println(this.name + " Track Not Available, please wait");
			this.wait();
			System.out.println(this.name + " Track Available");
		}
	}

	public synchronized void changeStatusTrack() throws InterruptedException {

		Random random = new Random();

		if ((random.nextInt(100)%2) == 0) {
			setStatus(true);
		} else {
			setStatus(false);
		}

		this.notify();
		Thread.sleep(3000);

	}

	@Override
	public String toString() {
		return "Airport [name=" + name + "]";
	}

}
