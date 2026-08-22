public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", 20);
        Pessoa pessoa2 = new Pessoa("Bia", 18);

        System.out.println("Pessoa 1: " + pessoa1.getNome() + " - " + pessoa1.getIdade() + " anos");
        System.out.println("Pessoa 2: " + pessoa2.getNome() + " - " + pessoa2.getIdade() + " anos");
    }
}
