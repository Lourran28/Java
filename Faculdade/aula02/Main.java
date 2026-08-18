public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.00, 0.10);
        Produto produto2 = new Produto("Smartphone", 2000.00, 0.15);

        produto1.exibirDados();
        produto2.exibirDados();
        System.out.println("Preço com desconto do produto 1: " + produto1.calDesconto());
        System.out.println("Preço com desconto do produto 2: " + produto2.calDesconto());

        System.out.println(produto1.realizarVenda(new DataTest(15, 6, 2024)));
    }
}
