package aula05b;

public class Comida {
    private double peso;
    private String nome;

    public Comida(double peso, String nome) {
        this.peso = peso;
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
