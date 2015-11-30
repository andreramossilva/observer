package obrserver.dieta;

import java.util.ArrayList;
import java.util.List;

import observer.Observable;
import observer.Observer;

public class Dieta implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();
    private double peso;

    public Dieta() {}

    public Dieta(double peso) {
        this.peso = peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : this.observers) {
            System.out.println("Notificando observers!");
            ob.update(this.peso);
        }
    }

}
