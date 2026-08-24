public class Animal {

    protected String nome;
    protected int idade;

    public Animal(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void exibirDados() {
        System.out.println("Animal: " + nome);
        System.out.println("Idade do animal: " + idade);
    }
}
