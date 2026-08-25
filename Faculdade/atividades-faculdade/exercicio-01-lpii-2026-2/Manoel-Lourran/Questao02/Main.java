package Questao02;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", "Caramelo", "Au au", "Vira-lata");
        Animal gato = new Gato("Mimi", "Branca", "Miau");

        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Cor: " + cachorro.getCor());
        System.out.println("Som: " + cachorro.emitirSom());

        System.out.println();

        System.out.println("Nome: " + gato.getNome());
        System.out.println("Cor: " + gato.getCor());
        System.out.println("Som: " + gato.emitirSom());
    }
}
