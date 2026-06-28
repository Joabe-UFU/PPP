public class Investidor implements Observador {
    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;
    private AcaoBroker broker;

    public Investidor(String nome, double limiteMinimo, double limiteMaximo, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.broker = broker;
    }

    @Override
    public void atualizar(String nomeAcao, double precoAtual) {
        System.out.printf("%s: está analisando %s. Preço atual: R$ %.2f (Limites: R$ %.2f - R$ %.2f)%n",
                nome, nomeAcao, precoAtual, limiteMinimo, limiteMaximo);

        if (precoAtual >= limiteMaximo) {
            System.out.printf("%s preço máximo atingido! Solicitando venda...%n", nome);
            broker.vender(nomeAcao, this.nome, precoAtual);
        }

        else if (precoAtual <= limiteMinimo) {
            System.out.printf("%s preço baixo! Solicitando compra...%n", nome);
            broker.comprar(nomeAcao, this.nome, precoAtual);
        }
    }
}