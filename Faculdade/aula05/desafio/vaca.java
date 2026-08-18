package desafio;

public class vaca extends animal {

    public vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Moo!");
    }

}
