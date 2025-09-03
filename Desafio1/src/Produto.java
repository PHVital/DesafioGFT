public class Produto {
    private String nome = "Caderno";
    private double preco = 15.00;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("O preço deve ser positivo");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirProduto() {
        System.out.printf("\nProduto: %s, Preco: R$%.2f", getNome(), getPreco());
    }
}
