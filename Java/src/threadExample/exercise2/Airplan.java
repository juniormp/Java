package threadExample.exercise2;

public class Airplan extends Thread {

	private String name;
	private Airport airport;
	
	public Airplan(String name, Airport airport){
		super();
		this.name = name;
		this.airport = airport;
	}
	
	public void takeOff() throws InterruptedException{
		System.out.println(this.name + " IS TAKING OFF");
		airport.waitAvailableTrack();
		System.out.println(this.name + " TAKE OFF COMPLETED");
	}
	
	public void fly() throws InterruptedException{
		Thread.sleep(2000);
	}
	
	public void land() throws InterruptedException{
		System.out.println(this.name + " IS LANDING");
		airport.waitAvailableTrack();
		System.out.println(this.name + " LAND COMPLETED");	
	}

	@Override
	public String toString() {
		return "Airplan [name=" + name + ", airport=" + airport + "]";
	}
	
	
	
	
}
