package threadExample.exercise2;

public enum Color {

	WHITE(21), BLACK(22), RED(23), YELLOW(24), BLUE(25);
	
	private int value;

	private Color(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	

}
