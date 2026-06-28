public class PrefeituraUberlandia implements Observador {
    @Override
    public void atualizar(double temperatura, double umidade, double velocidadeVento) {
        System.out.println("\nDados recebidos pela Prefeitura de Uberlandia.");
        System.out.printf("Umidade Atual: %.1f%%%n", umidade);

        if (umidade < 30.0) {
            System.out.println("Alerta: Umidade muito baixa!");
        } else {
            System.out.println("Status: Umidade normal.");
        }
    }
}