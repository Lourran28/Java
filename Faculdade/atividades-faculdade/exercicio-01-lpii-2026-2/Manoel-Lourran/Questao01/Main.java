package Questao01;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 5000.00, "Financeiro");
        Funcionario analista = new Analista("Mariana", 3500.00, "Java");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Cargo: Gerente");
        System.out.printf("Bonus: R$ %.2f%n", gerente.calcularBonus());

        System.out.println();

        System.out.println("Nome: " + analista.getNome());
        System.out.println("Cargo: Analista");
        System.out.printf("Bonus: R$ %.2f%n", analista.calcularBonus());
    }
}
