
public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("ana", 20);

        pessoa1.setIdade(-5);
        System.out.println("Idade depois da tentativa: " + pessoa1.getIdade());

        pessoa1.setIdade(21);
        System.out.println("Idade atualizada: " + pessoa1.getIdade());
    }
}
