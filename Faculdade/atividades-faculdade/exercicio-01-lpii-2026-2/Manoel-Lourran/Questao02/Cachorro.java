package Questao02;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String cor, String som, String raca) {
        super(nome, cor, som);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return getSom();
    }
}
