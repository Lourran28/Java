public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(idade, nome);
    }

    public void latir() {
        System.out.println(nome + " latiu");
    }
}
