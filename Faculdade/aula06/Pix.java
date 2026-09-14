package aula06;

public class Pix implements Pagavel {
    private double valor;

    public Pix(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcPagamento() {
        return this.valor * 0.95;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Gerando QR Code do PIX...");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
