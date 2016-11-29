package SOLID.SRC;

public enum Cargo {

	// Tipo do cargo(regra da porcentagem de salario)
	// Encapsulamento com o Cargo e sua regra de negocio para calculo do salario
	DESENVOLVEDOR(new DezOuVintePorcento()), DBA(new QuinzeOuVinteCincoPorcento()), TESTER(
			new QuinzeOuVinteCincoPorcento());

	private RegraDeSalario regra;

	private Cargo(RegraDeSalario regraDeSalario) {
		this.regra = regraDeSalario;
	}

	public RegraDeSalario getRegra() {
		return regra;
	}

}
