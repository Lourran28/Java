package Questao02;

public class Gato extends Animal {

    public Gato(String nome, String cor, String som) {
        super(nome, cor, som);
    }

    @Override
    public String emitirSom() {
        return getSom();
    }
}
