import java.util.Scanner;

public class TreinoJava {

    public static void main(String[] args) {
        try (Scanner entrado = new Scanner(System.in)) {

            System.out.println("Qual sua idade? ");
            int idade = entrado.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade ");
            } else {
                System.out.println("MEnor de idade ");
            }
            System.out.println("Idade DIgitada: " + idade);
        }

    }
}
