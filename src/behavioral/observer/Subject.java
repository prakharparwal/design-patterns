package behavioral.observer;

public interface Subject {

    void notifyObservers();
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
