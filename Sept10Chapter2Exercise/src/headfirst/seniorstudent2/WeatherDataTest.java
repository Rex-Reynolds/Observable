/**
 * WeatherDataTest.java 1.0 Sep 15, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds III. All Rights Reserved
 */
package headfirst.seniorstudent2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * @author SAUCE
 * @version 1.0
 *
 */
public class WeatherDataTest extends WeatherData{
	private WeatherData weatherData;
	Observer observer;
	Observer observer2;
	
	static class TestObserver implements Observer {
		

		/* (non-Javadoc)
		 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
		 */
		@Override
		public void update(Observable observed, Object arg) {
			
			
		}

	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		WeatherData weatherData = new WeatherData();
		
		
		
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		weatherData = null;
	}

	/**
	 * Test method for {@link headfirst.seniorstudent2.WeatherData#setMeasurements(float, float, float)}.
	 */
	@Test
	public void testSetMeasurements() {
		
		float humidity = 10;
		float temperature = 11 ;
		float pressure = 12;
		weatherData.setMeasurements(temperature, humidity, pressure);
		assertEquals(humidity,weatherData.getPressure(),0.5);

	}

	/**
	 * Test method for {@link java.util.Observable#addObserver(java.util.Observer)}.
	 */
	@Test
	public void testAddObserver() {
		
		weatherData.addObserver(observer = new TestObserver());
		assertEquals(1,weatherData.countObservers());
		
	}

	/**
	 * Test method for {@link java.util.Observable#deleteObserver(java.util.Observer)}.
	 */
	@Test
	public void testDeleteObservers() {
		weatherData.addObserver(observer = new TestObserver());
		weatherData.addObserver(observer2 = new TestObserver());
		weatherData.deleteObserver(observer);
		assertEquals("Failed to delete observer",
				0, weatherData.countObservers());
	}

}
