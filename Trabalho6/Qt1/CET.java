import java.util.ArrayList;
import java.util.List;

public class CET implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private DadosMeteorologicos dadosMeteorologicos;

    public void setDadosMeteorologicos(DadosMeteorologicos dados) {
        this.dadosMeteorologicos = dados;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(dadosMeteorologicos);
        }
    }
}