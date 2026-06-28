public class Main {
    public static void main(String[] args) {
        AcaoBroker brokerCompartilhado = new AcaoBroker();

        Acao mglu3 = new Acao("MGLU3", 10.00);

        Investidor lucas = new Investidor("Lucas", 5.00, 12.00, brokerCompartilhado);
        Investidor ernesto = new Investidor("Ernesto", 8.00, 14.00, brokerCompartilhado);

        mglu3.registrarObservador(lucas);
        mglu3.registrarObservador(ernesto);

        mglu3.setPreco(13);

        mglu3.setPreco(7);
    }
}