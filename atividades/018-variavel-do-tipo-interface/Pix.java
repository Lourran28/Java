public class Pix implements Pagavel {
    private  double valor;

    public Pix(double valor) {
        this.valor = valor;
    }
   public double  calcularPagamento(){
    return valor * 0.95;
  }
  public void processandoPagamento(){
    System.out.println("Codigo qr gerando");
  }
}
