import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    
    // Atributo
    private List<Compras> comprasCar;

    // Construtor para sempre que eu chamar o compra list ele já ter sido criado uma lista vazia
    public CarrinhoCompras() {
        this.comprasCar = new ArrayList<>();
    }

    // Metodo adicionar compra
    public void adicionarItem(String nome, double preco, int quantidade){
        comprasCar.add(new Compras(nome, preco, quantidade));
    }

    // Metodo remover compra
    public void removerItem(String nome){
        List<Compras> itemParaRemover = new ArrayList<>();
        for(Compras c : comprasCar){
            if(c.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(c);
            }
        }
        comprasCar.removeAll(itemParaRemover);
    }

    // Metodo Calcular Valor Total
    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for(Compras c : comprasCar){
            valorTotal += c.getPreco() * c.getQuantidade();
        }
        return Math.round(valorTotal * 100.0) / 100.0; // Retorna só as primeiras duas casas decimais
    }

    // Metodo exibir itens
    public void exibirItens(){
        System.out.println(comprasCar);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        System.out.println("O valor total do seu carrinho de compras é: R$" + carrinhoCompras.calcularValorTotal());

        carrinhoCompras.adicionarItem("Jogo de Talheres", 32.95, 1);
        carrinhoCompras.adicionarItem("Escorredor de Louça", 11.77, 1);
        carrinhoCompras.adicionarItem("Lixeira", 15.75, 2);
        carrinhoCompras.adicionarItem("Tabua de corte", 13.49, 1);
        carrinhoCompras.adicionarItem("Suporte de escovas de dente", 7.99, 1);
        carrinhoCompras.adicionarItem("Suporte de sabonete e shampoo", 14.38, 1);
        System.out.println("O valor total do seu carrinho de compras é: R$" + carrinhoCompras.calcularValorTotal());

        carrinhoCompras.removerItem("Lixeira");
        System.out.println("O valor total do seu carrinho de compras é: R$" + carrinhoCompras.calcularValorTotal());

        carrinhoCompras.exibirItens();
    }
}
