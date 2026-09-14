package aula06.desafio;

public class App {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("Vermelho", true, 5.0, 3.0);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        Circulo circulo = new Circulo("Azul", true, 2.0);
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}
