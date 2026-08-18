package Animal;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3, "Marrom", "Labrador");

        cachorro.exibirDetalhes();
        cachorro.latir();
        cachorro.comer();
        cachorro.amamentar();
        System.out.println("Raça: " + cachorro.getRaca());

    }
}
