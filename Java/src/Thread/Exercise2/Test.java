package Thread.Exercise2;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Airport a = new Airport();
		Airplan b = new Airplan();
		
	
		
		b.start();
		 while(true){
			 a.start(); 
		 }
		
		

		

	}

}
