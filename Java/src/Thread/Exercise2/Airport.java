package Thread.Exercise2;

public class Airport extends Thread {

	private String name;
	private boolean statusTrack;

	@Override
	public synchronized void run() {

		notifyAll();
		

		
	}

	
}
