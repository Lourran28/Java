package aula06;

public class Cartao implements Pagavel {
    private double valor;
    private int parcelas;

    public Cartao(double valor, int parcelas) {
        this.valor = valor;
        this.parcelas = parcelas;
    }

    @Override
    public double calcPagamento() {
        return this.valor + (this.valor * 0.02 * this.parcelas);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento nna operadora em " + this.parcelas + " parcelas...");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
