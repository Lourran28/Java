public class Main {

    public static void main(String[] args) {
       Pix pagamentoPix = new Pix(100);  // cria o Pix
       Boleto pagamentoBoleto = new Boleto(100);  // cria o Boleto

       System.out.println("Valor final do Pix: " + pagamentoPix.calcularPagamento());
       pagamentoPix.processarPagamento();  // processa o Pix

       System.out.println("Valor final do Boleto: " + pagamentoBoleto.calcularPagamento());
       pagamentoBoleto.processarPagamento(); // processa o Boleto
    }

    
}
