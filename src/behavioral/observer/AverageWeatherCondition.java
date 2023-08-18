package behavioral.observer;

public class AverageWeatherCondition implements Observer {

    private int sumOfTemperatures;
    private int totalCount;

    public AverageWeatherCondition(Subject subject) {
        sumOfTemperatures = 0;
        totalCount = 0;
        subject.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        sumOfTemperatures += temperature;
        totalCount++;
        display();
    }

    private void display() {
        System.out.println("Average temperature for the past :"+totalCount+ " records :"+(sumOfTemperatures/totalCount));
    }
}
