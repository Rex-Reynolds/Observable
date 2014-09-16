/*
 * Subject.java 1.0 Sep 10, 2014
 *
 * Copyright (c) 2014 HFDP
 */
package headfirst.seniorstudent2;

/**
 * @author SAUCE
 * @version 1.0
 *
 */
public interface Subject {

  /**
 * 
 */
public void notifyObservers();

  /**
 * @param o
 */
public void registerObserver(Observer o);

  /**
 * @param o
 */
public void removeObserver(Observer o);
}
