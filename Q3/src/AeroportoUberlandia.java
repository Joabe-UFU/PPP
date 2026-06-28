public class AeroportoUberlandia implements Observador {
    @Override
    public void atualizar(double temperatura, double umidade, double velocidadeVento) {
        System.out.println("\nDados recebidos pelo Aeroporto de Uberlandia.");
        System.out.printf("Velocidade do Vento: %.1f km/h%n", velocidadeVento);

        if (velocidadeVento > 50.0) {
            System.out.println("Alerta: Vento forte, condições de pouso severas.");
        } else {
            System.out.println("Status: Operações de voo normais.");
        }
    }
}