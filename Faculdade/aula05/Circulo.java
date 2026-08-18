public class Circulo extends FormaGeometrica {
    protected double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

}