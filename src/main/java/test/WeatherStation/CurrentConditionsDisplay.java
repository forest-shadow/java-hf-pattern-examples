package test.WeatherStation;

import test.WeatherStation.Observer.*;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  float temperature;
  float humidity;
  Subject weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println("Current conditions: " + temperature
    + "F degrees and " + humidity + "% humidity");
  }
}