package aula06;

public class MainPedido {
    public static void main(String[] args) {
        System.out.println("=== Monstando ===");
        Pedido pedido = new Pedido();
        pedido.addItem("Coca Cola 2L", 5, 12.0);
        pedido.addItem("Coxinha", 5, 10.0);
        double total = pedido.calcularTotal();
        System.out.println("Total do pedido: R$ " + total);

        System.out.println("Escolhendo Forma de Pagamento...");
        Pagavel formaPg = new Pix(total);
        pedido.definirPagamento(formaPg);

        // Finalizando Pedido
        pedido.finalizarPedido();
    }
}
