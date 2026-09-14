package aula06.desafio;

public class Retangulo extends Forma implements Area {
    private double largura;
    private double altura;

    public Retangulo(String cor, boolean plana, double largura, double altura) {
        super(cor, plana);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

}
