import java.util.Scanner;

public class TreinoJava {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("Qual sua nota da primeira etapa: ");
            double nota1 = entrada.nextDouble();

            System.out.println("Qual sua nota da segunda etapa:  ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2) / 2;

            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println("Sua media final foi " + media);
        }
    }
}
