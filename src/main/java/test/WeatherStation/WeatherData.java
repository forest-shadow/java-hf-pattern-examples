package test.WeatherStation;

import java.util.ArrayList;
import test.WeatherStation.Observer.Subject;
import test.WeatherStation.Observer.*;

public class WeatherData implements Subject {
  ArrayList<Observer> observers;
  float temperature;
  float humidity;
  float pressure;

  public WeatherData() {
    observers = new ArrayList<Observer>();
  }

  public void registerObserver(Observer o) {
    observers.add(o);
  }

  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if(i >= 0) {
      observers.remove(i);
    }
  }

  public void notifyObservers() {
    for(int i = 0; i < observers.size(); i++) {
      Observer observer = observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}