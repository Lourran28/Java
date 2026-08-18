package Funcionario;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.1;
    }

    public void exibirDados() {
        System.out.println("=== Dados do Funcionário ===");
        System.out.println("NOME: " + this.nome);
        System.out.println("SALÁRIO: " + this.salario);
        System.out.println("BÔNUS: " + this.calcularBonus());
        System.out.println("SALÁRIO FINAL: " + (this.salario + this.calcularBonus()));
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

}
