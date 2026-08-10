import java.util.Scanner;

public class TreinoJava {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("Qual seu primeiro numero: ");
            int primeiroNumero = entrada.nextInt();

            System.out.println("Qual seu segundo numero: ");
            int segundoNumero = entrada.nextInt();

            int soma = primeiroNumero + segundoNumero;
            int subtracao = primeiroNumero - segundoNumero;
            int multiplicacao = primeiroNumero * segundoNumero;

            System.out.println("Soma: " + soma);
            System.out.println("Subtracao: " + subtracao);
            System.out.println("Multiplicacao: " + multiplicacao);
        }
    }
}
