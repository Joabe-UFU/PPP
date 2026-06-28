class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double total) {
        System.out.println("Boleto no valor de R$ " + String.format("%.2f",total) + " gerado!");
    }
}