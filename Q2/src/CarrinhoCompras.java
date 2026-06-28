import java.util.ArrayList;
import java.util.List;

class CarrinhoCompras {
    private List<Item> itens = new ArrayList<>();
    private FreteStrategy estrategiaFrete;

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

    public void setFreteStrategy(FreteStrategy estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calculaFrete() {
        if (this.estrategiaFrete == null) {
            return 0.0;
        }
        return this.estrategiaFrete.calcular(calculaTotal());
    }

    public void realizaPagamento(PagamentoStrategy estrategiaPagamento) {
        double totalItens = calculaTotal();
        double valorFrete = calculaFrete();
        double totalGeral = totalItens + valorFrete;

        System.out.println("Subtotal Itens: R$ " + String.format("%.2f",totalItens));
        System.out.println("Valor do Frete: R$ " + String.format("%.2f",valorFrete));

        estrategiaPagamento.pagar(totalGeral);
    }
}