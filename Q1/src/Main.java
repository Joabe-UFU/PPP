public class Main {
  public static void main(String[] args) {
    CarrinhoCompras carrinho = new CarrinhoCompras();

    Item camiseta = new Item("Camiseta", 125.50);
    Item calçaJeans = new Item("Calça Jeans", 435.00);

    carrinho.adicionaItem(camiseta);
    carrinho.adicionaItem(calçaJeans);

    System.out.println("Total do carrinho: R$ " + carrinho.calculaTotal());

    System.out.println("Teste de pagamento com PIX");

    carrinho.realizaPagamento(new PixPagamento());

    System.out.println("\nRemovendo Calça Jeans do carrinho.");
    carrinho.removeItem(calçaJeans);

    System.out.println("\nTotal do carrinho: R$ " + carrinho.calculaTotal());


    System.out.println("Teste de pagamento com Cartão.");
    carrinho.realizaPagamento(new CartaoPagamento());

    System.out.println("Teste de pagamento com Boleto.");
    carrinho.realizaPagamento(new BoletoPagamento());
  }
}
