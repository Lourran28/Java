package Funcionario;

public class Vendas {
    public static void main(String[] args) {
        System.out.println("=== Funcionario Genérico ===");
        Funcionario funcionario = new Funcionario("João", 2000.0);
        funcionario.exibirDados();

        System.out.println("\n=== Gerente ===");
        Gerente gerente = new Gerente("Maria", 3000.0, 500.0);
        gerente.exibirDados();

        System.out.println("\n=== Vendedor ===");
        Vendedor vendedor = new Vendedor("Carlos", 2000.0, 1000.0, 0.05);
        vendedor.exibirDados();
    }
}
