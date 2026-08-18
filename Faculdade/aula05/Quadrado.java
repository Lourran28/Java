public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }
}