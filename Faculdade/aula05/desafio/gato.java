package desafio;

public class gato extends animal {

    public gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Meow!");
    }

}
