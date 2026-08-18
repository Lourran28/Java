package aula03;

public class MainConta {
    public static void main(String[] args) {
        System.out.println("--- Criando Conta ---");
        ContaBancaria conta = new ContaBancaria("João", 1000.0);
        conta.exibirExtrato();

        System.out.println("\n--- Testando Depósitos ---");
        conta.depositar(500.0);
        conta.exibirExtrato();

        System.out.println("\n--- Testando Saques ---");
        conta.sacar(5000);
        conta.exibirExtrato();
    }

}
