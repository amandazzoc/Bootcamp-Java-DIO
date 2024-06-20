

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        if (!estoqueProdutosMap.isEmpty()) {
            System.out.println(estoqueProdutosMap);
        } else {
            System.out.println("O estoque está vazio");
        }

    }

    public double calcularValorTotalEstoque() {
        double ValorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                ValorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } else {
            System.out.println("O estoque está vazio");
        }
        return ValorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE; // O primeiro produto que pegar já será o maior preço
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }else{
            System.out.println("O estoque está vazio");
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }else{
            System.out.println("O estoque está vazio");
        }
        return produtoMaisBarato;
    }



    public static void main(String[] args) throws Exception {
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        estoqueProduto.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProduto.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProduto.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoqueProduto.adicionarProduto(4L, "Produto D", 2, 20.0);
        estoqueProduto.adicionarProduto(5L, "Produto E", 4, 10.0);

        estoqueProduto.exibirProdutos();

        System.out.println("O valor total do estoque: R$" + estoqueProduto.calcularValorTotalEstoque());

        System.out.println("O produto mais caro é: " + estoqueProduto.obterProdutoMaisCaro());
        System.out.println("O produto mais barato é: " + estoqueProduto.obterProdutoMaisBarato());
    }

}
