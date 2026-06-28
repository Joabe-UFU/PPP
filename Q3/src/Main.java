public class Main {
    public static void main(String[] args) {
        CentralEstacaoTempo cet = new CentralEstacaoTempo();

        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia aeroporto = new AeroportoUberlandia();

        cet.registrarObservador(prefeitura);
        cet.registrarObservador(aeroporto);

        System.out.println("Primeira atualização do clima");
        cet.setMedicoes(35.2, 20.0, 18.2);

        System.out.println("\nSegunda atualização do clima");
        cet.setMedicoes(23.0, 75.0, 56.1);
    }
}