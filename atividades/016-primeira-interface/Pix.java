public class Pix implements Pagavel {
      private double valor;

    public Pix(double valor) {
        this.valor = valor;
    }
    public double CalcularPagamento() {
        return valor * 0.95;
    }
    public void processarPagamento(){
        System.out.println("Gerando codigo GR");
    }
}
