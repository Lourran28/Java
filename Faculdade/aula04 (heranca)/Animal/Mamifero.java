package Animal;

public class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public void amamentar() {
        System.out.println(this.nome + " está amamentando.");
    }

    public String getCorPelo() {
        return corPelo;
    }

}
