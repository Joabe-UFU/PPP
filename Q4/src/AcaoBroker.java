public class AcaoBroker {
    public void comprar(String nomeAcao, String nomeInvestidor, double preco) {
        System.out.printf("[BROKER] Executando COMPRA de %s para %s no valor de R$ %.2f%n",
                nomeAcao, nomeInvestidor, preco);
    }

    public void vender(String nomeAcao, String nomeInvestidor, double preco) {
        System.out.printf("[BROKER] Executando VENDA de %s para %s no valor de R$ %.2f%n",
                nomeAcao, nomeInvestidor, preco);
    }
}