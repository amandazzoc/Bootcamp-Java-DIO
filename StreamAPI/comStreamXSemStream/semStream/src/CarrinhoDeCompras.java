import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itemList;
    //construtor
    public CarrinhoDeCompras() {
      this.itemList = new ArrayList<>();
    }
  
    public void adicionarItens(int preco, int quant){
        itemList.add(new Item(preco, quant));
    }

    public void exibirItens(){
      System.out.println(itemList);
    }

    //método para calcular valor total dos itens sem utilizar o Stream API
    public double calcularValorTotal() {
      double valorTotal = 0d;
      if (!itemList.isEmpty()) {
        for (Item item : itemList) {
          double valorItem = item.getPreco() * item.getQuant();
          valorTotal += valorItem;
        }
        return valorTotal;
      } else {
        throw new RuntimeException("A lista está vazia!");
      }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItens(10, 1);
        carrinhoDeCompras.adicionarItens(2, 3);
        carrinhoDeCompras.adicionarItens(3, 5);
        carrinhoDeCompras.adicionarItens(6, 6);

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total do carrinho é de: " + carrinhoDeCompras.calcularValorTotal());
    }
}