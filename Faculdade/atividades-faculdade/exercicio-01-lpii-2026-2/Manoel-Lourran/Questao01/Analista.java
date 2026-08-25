package Questao01;

public class Analista extends Funcionario {
    private String linguagem;

    public Analista(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }
}
