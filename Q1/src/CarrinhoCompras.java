import java.util.ArrayList;
import java.util.List;

class CarrinhoCompras {
    private List<Item> itens = new ArrayList<>();

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    public void realizaPagamento(PagamentoStrategy estrategiaPagamento) {
        double total = calculaTotal();
        estrategiaPagamento.pagar(total);
    }
}