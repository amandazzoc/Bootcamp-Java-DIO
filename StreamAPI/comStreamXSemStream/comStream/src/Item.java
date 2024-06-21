public class Item {

    private int preco;
    private int quant;

    @Override
    public String toString() {
        return "(Preço: " + preco + ", Quantidade: " + quant + ")";
    }

    public Item(int preco, int quant) {
        this.preco = preco;
        this.quant = quant;
    }
    
    public int getPreco() {
        return preco;
    }
    public int getQuant() {
        return quant;
    }



}
