package behavioral.observer;

public class Driver {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentWeatherCondition currentWeatherCondition = new CurrentWeatherCondition(weatherStation);
        AverageWeatherCondition averageWeatherCondition = new AverageWeatherCondition(weatherStation);

        weatherStation.detailsChanged(20, 10);
        weatherStation.detailsChanged(10, 10);
        weatherStation.detailsChanged(50, 10);
    }
}
