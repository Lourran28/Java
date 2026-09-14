public class Boleto implements Pagavel {
    private double valor;

    public Boleto(double valor) {
        this.valor = valor;
    }
    public double calcularPagamento(){
        return valor;
    }
    public void processandoPagamento(){
        System.out.println("Gerando codigo do boleto");
    }
}
