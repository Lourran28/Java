package Funcionario;

public class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissao;

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    public Vendedor(String nome, double salario, double totalVendas, double comissao) {
        super(nome, salario);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularBonus() {
        double total = this.totalVendas * this.comissao;
        return super.calcularBonus() + total;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
