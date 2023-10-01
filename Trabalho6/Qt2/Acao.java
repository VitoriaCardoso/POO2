import java.util.ArrayList;
import java.util.List;

public class Acao implements Subject {
    private String nome;
    private double precoAtual;
    private List<Observer> investidores = new ArrayList<>();

    public Acao(String nome, double precoAtual) {
        this.nome = nome;
        this.precoAtual = precoAtual;
    }

    public void setPrecoAtual(double novoPreco) {
        if (novoPreco != precoAtual) {
            precoAtual = novoPreco;
            notifyObservers();
        }
    }

    public void addObserver(Observer observer) {
        investidores.add(observer);
    }

    public void removeObserver(Observer observer) {
        investidores.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : investidores) {
            observer.update(this);
        }
    }

    public double getPrecoAtual() {
        return precoAtual;
    }

    public String getNome() {
        return nome;
    }
}
