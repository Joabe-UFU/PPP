public class Main {
  public static void main(String[] args) {
    CarrinhoCompras carrinho = new CarrinhoCompras();

    Item camiseta = new Item("Camiseta", 125.50);
    Item calcaJeans = new Item("Calça Jeans", 435.00);

    carrinho.adicionaItem(camiseta);
    carrinho.adicionaItem(calcaJeans);

    System.out.println("Frete Sedex com pagamento em Pix");
    carrinho.setFreteStrategy(new FreteSedex());
    carrinho.realizaPagamento(new PixPagamento());

    System.out.println("\nFrete Normal com pagamento em Cartão");
    carrinho.removeItem(calcaJeans);
    carrinho.setFreteStrategy(new FreteNormal());
    carrinho.realizaPagamento(new CartaoPagamento());
  }
}
