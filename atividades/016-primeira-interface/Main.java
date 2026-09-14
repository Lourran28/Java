public class Main {

    public static void main(String[] args) {
        Pix pagamento = new Pix(100);

        System.out.println("Valor final: R$ " + pagamento.CalcularPagamento());

        pagamento.processarPagamento();
    }
}