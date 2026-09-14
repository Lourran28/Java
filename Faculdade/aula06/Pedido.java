package aula06;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private Pagavel formaPagamento;

    public Pedido() {
    }

    public Pedido(Pagavel formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void addItem(String produto, int qtd, double preco) {
        itens.add(new ItemPedido(produto, qtd, preco)); // nasce o ItemPedido (composição)
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcSubTotal();
        }
        return total;
    }

    public void definirPagamento(Pagavel pagavel) { // polimorfismo de subtipo
        this.formaPagamento = pagavel; // pagavel já existia antes de ser associado à um pedido
        // Cartão, Pix ou Boleto
    }

    public void finalizarPedido() {
        System.out.println("=== Resumo Pedido ===");
        for (ItemPedido item : itens) {
            System.out.println(item.getQuantidade() + " x " + item.getProduto());
            System.out.println("Preço unitário: R$ " + item.getPrecoUnitario());
            System.out.println("Subtotal: R$ " + item.calcSubTotal());
        }
        System.out.println("O total dos itens: R$ " + this.calcularTotal());
        if (this.formaPagamento != null) {
            System.out.println("O valor a pagar: R$ " + this.formaPagamento.calcPagamento());
            this.formaPagamento.processarPagamento();
        } else {
            System.out.println("Nenhuma forma de pagamento válida foi definida!");
        }
    }
}
