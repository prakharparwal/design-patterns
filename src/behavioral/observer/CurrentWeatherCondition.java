package behavioral.observer;

public class CurrentWeatherCondition implements Observer {

    private int temperature;
    private int humidity;

    public CurrentWeatherCondition(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("Current weather condition: Temperature: "+temperature+" Humidity: "+humidity);
    }
}
