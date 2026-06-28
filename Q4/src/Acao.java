import java.util.ArrayList;
import java.util.List;

public class Acao implements Sujeito {
    private String nome;
    private double preco;
    private List<Observador> investidores = new ArrayList<>();

    public Acao(String nome, double precoInicial) {
        this.nome = nome;
        this.preco = precoInicial;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.printf("%n[MERCADO] A ação %s mudou de preço para R$ %.2f%n", nome, preco);
        notificarObservadores();
    }

    @Override
    public void registrarObservador(Observador o) { investidores.add(o); }

    @Override
    public void removerObservador(Observador o) { investidores.remove(o); }

    @Override
    public void notificarObservadores() {
        for (Observador o : investidores) {
            o.atualizar(nome, preco);
        }
    }
}