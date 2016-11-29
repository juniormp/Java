package SOLID.SRC;

public class CalculadoraDeSalario implements RegraDeSalario {

	public double calcula(Funcionario funcionario) {

		return funcionario.calculaSalario();

	}

}
