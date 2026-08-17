
public class Pessoa {

    private String pessoa;
    private int idade;

    public Pessoa(String pessoa, int idade) {
        this.pessoa = pessoa;
        this.idade = idade;
    }

    public String getPessoa() {
        return pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalida");
        }
    }
}
