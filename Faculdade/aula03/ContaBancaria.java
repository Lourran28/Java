package aula03;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public String getTitular(String novoTitular) {
        if (novoTitular != null && !novoTitular.trim().isEmpty()) {
            this.titular = novoTitular;
        } else {
            System.out.println("Nome inválido! O nome do titular não pode ser alterado.");
        }
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor do saque inválido!");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para o saque de R$" + valor);
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor do depósito inválido!");
        }
    }

    public void exibirExtrato() {
        System.out.println("==== EXTRATO ====");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("=================");
    }

}
