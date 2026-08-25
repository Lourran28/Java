package Questao02;

public class Animal {
    private String nome;
    private String cor;
    private String som;

    public Animal(String nome, String cor, String som) {
        this.nome = nome;
        this.cor = cor;
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String emitirSom() {
        return som;
    }
}
