package Animal;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
