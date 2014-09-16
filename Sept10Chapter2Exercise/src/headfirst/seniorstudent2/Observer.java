/*
 * Observer.java 1.0 Sep 10, 2014
 *
 * Copyright (c) 2014 HFDP and DJP
 */

package headfirst.seniorstudent2;


/**
 * @author SAUCE
 * @version 1.0
 *
 */
public interface Observer {

  /**
 * @param temperature
 * @param humidity
 * @param pressure
 */
public void updateData(float temperature, float humidity, float pressure);
}
