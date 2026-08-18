package desafio;

public class mainAnimal {
    public static void main(String[] args) {
        animal animal1 = new vaca("Mimosa");
        animal animal2 = new gato("Whiskers");
        animal animal3 = new cachorro("Rex");

        System.out.println(animal1.getNome() + " diz:");
        animal1.emitirSom();

        System.out.println(animal2.getNome() + " diz:");
        animal2.emitirSom();

        System.out.println(animal3.getNome() + " diz:");
        animal3.emitirSom();
    }
}
