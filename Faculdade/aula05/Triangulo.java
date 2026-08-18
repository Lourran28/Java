public class Triangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

}