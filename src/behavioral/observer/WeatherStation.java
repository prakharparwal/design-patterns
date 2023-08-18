package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observers;
    private int temperature;
    private int humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity));
    }

    @Override
    public void registerObserver(Observer observer) {
        if(!hasObserver(observer)) observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(hasObserver(observer)) observers.remove(observer);
    }

    private boolean hasObserver(Observer observer) {
        return observers.contains(observer);
    }

    public void detailsChanged(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

}
