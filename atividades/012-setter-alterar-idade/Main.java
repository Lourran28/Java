
public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(20, "ana");

        System.out.println("Idade antes: " + pessoa1.getIdade());

        pessoa1.setIdade(21);

        System.out.println("Idade depois: " + pessoa1.getIdade());
    }
}
