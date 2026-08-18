public class Produto {
    String nome;
    double preco;
    double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Desconto: " + this.desconto * 100 + "%");
    }

    double calDesconto() {
        double desc = this.preco - (this.preco * this.desconto);
        return desc;
    }

    String realizarVenda(DataTest data) {
        double valor = calDesconto();
        return "Venda Realizada\nProduto: " + this.nome + "\nPreço: " + this.preco + "\nDesconto: "
                + this.desconto * 100 + "%\nPreço com desconto: " + valor + "\nData da venda: " + data.obterData();
    }
}
