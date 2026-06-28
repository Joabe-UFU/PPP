class PixPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double total) {
        System.out.println("Pagamento de R$ " + String.format("%.2f",total) + " realizado via Pix.");
    }
}