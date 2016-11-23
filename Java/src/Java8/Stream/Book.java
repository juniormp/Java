package Java8.Stream;

public class Book {

	private String name;
	private int qtd;

	public Book(String name, int qtd) {
		super();
		this.name = name;
		this.qtd = qtd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}
