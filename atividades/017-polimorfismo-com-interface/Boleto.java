public class Boleto implements Pagavel {
   private double  valor;

    public Boleto(double valor) {
        this.valor = valor;
    }
    public double calcularPagamento(){
        return valor;
    }

    public void processarPagamento() {
       System.out.println("Codigo de barrras Gerado.");
    }
    
}
