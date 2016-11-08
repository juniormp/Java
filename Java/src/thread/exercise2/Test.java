package threadExample.exercise2;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Airport gru = new Airport("GRU");
		Color color;
		Airplan gol = new Airplan("GOL", gru);
		Airplan tam = new Airplan("TAM", gru);
		Airplan azul = new Airplan("AZUL", gru);

		gru.start();

	}

}
