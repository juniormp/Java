package SOLID.LSP;
public class ContaComum {

    private ManipuladorDeSaldo manipulador;

    public ContaComum(ManipuladorDeSaldo manipuladorDeSaldo) {
        this.manipulador = manipuladorDeSaldo;
    }

 
    public void rende() {
        this.manipulador.rende(1.0);
    }
    
    public void saca(double valor){
    	manipulador.saca(valor);
    }
    
    public void deposita(double valor){
    	manipulador.deposita(valor);
    }


 
}