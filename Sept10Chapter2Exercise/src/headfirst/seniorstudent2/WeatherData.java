/*
 * WeatherData.java 1.0 Sep 10, 2014
 *
 * Copyright (c) 2014 HFDP and DJP
 */
package headfirst.seniorstudent2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Observable (Subject) broadcasts out pressure, temperature and humidity to all
 * Observer
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public class WeatherData extends Observable {

	private float humidity;
	private float pressure;
	private float temperature;
	

	/**
	 * Initializes empty list of Observers
	 */
	public WeatherData() {

	}

	/**
	 * @return float
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * @return float
	 */
	public float getPressure() {
		return pressure;
	}

	/**
	 * @return float
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
 * 
 */
	public void measurementsChanged() {
		System.out.println(this.toString());
		setChanged();
		notifyObservers();
	}

	/**
	 * Notifies all observers that data has changed. Precondition assumed that
	 * any observer that has registered will all remove itself when it no longer
	 * desires service
	 */
//	@Override
//	public void notifyObservers() {
//		for (Observer observer : observers) {
//			observer.updateData(temperature, humidity, pressure);
//		}
//	}
//
//	/**
//	 * @param o
//	 */
//	public void registerObserver(Observer o) {
//		observers.add(o);
//	}
//
//	/**
//	 * @param o
//	 */
//	public void removeObserver(Observer o) {
//		boolean result = observers.remove(o);
//		System.out.println("Observer removed success is " + result);
//	}

	/**
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	@Override
	public String toString() {
		String s = "temperature: " + temperature;
		s = s + "\n" + "humidity: " + humidity;
		s = s + "\n" + "pressure: " + pressure;
		return s;
	}

}
