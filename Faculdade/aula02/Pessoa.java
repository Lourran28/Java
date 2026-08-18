import Aluno.Pessoa;

public class Pessoa {
    String nome;
    int idade;
    String sexo;
    String cpf;
    String rg;
    String contato;

    void VerificarClt() {
        if (idade >= 18) {
            System.out.println("Trabalhar vagabundo: " + this.nome);
        } else {
            System.out.println("Estudar Vagabundo: " + this.nome);
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Ramon";
        pessoa1.idade = 22;
        pessoa1.sexo = "Masculino";
        pessoa1.cpf = "123.456.789-00";
        pessoa1.rg = "12.345.678-9";
        pessoa1.contato = "(31) 98765-4321";

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        pessoa1.VerificarClt();
    }
}