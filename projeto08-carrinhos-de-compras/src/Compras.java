public class Compras {
    
    // Atributo
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return  nome + " R$" + preco + " Quantidade: " + quantidade;
    }

    // Construtor
    public Compras(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getter
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
