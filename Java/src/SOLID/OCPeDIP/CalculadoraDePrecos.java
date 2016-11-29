package SOLID.OCPeDIP;

public class CalculadoraDePrecos {

	
	private ServicoDeEntrega servico;
	private TabelaDePreco tabela;


	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega servico) {
	
		this.tabela = tabela;
		this.servico = servico;
		
	
	}  
	
	
	public double calcula(Compra produto) {

		double desconto = tabela.descontoPara(produto.getValor());
		double frete = servico.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}