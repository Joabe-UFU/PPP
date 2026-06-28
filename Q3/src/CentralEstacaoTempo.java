import java.util.ArrayList;
import java.util.List;

public class CentralEstacaoTempo implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();
    private double temperatura;
    private double umidade;
    private double velocidadeVento;

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.atualizar(temperatura, umidade, velocidadeVento);
        }
    }

    public void setMedicoes(double temperatura, double umidade, double velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;
        notificarObservadores();
    }
}