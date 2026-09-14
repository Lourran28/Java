package aula06.desafio;

public class Circulo extends Forma implements Area {
    private double raio;

    public Circulo(String cor, boolean plana, double raio) {
        super(cor, plana);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }

}
