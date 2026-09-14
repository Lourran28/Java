

public class Main {

    public static void main(String[] args) {
       Pagavel pagamento1 = new Pix(100);
       Pagavel pagamento2 = new Boleto(100);

       System.out.println("Pagamento 1: " + pagamento1.calcularPagamento());
       pagamento1.processandoPagamento();

       System.out.println("Pagamento 2: " +  pagamento2.calcularPagamento());
       pagamento2.processandoPagamento();
    }
}
