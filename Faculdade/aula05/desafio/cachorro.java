package desafio;

public class cachorro extends animal {

    public cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Woof!");
    }
}
