/*
 * Subject.java 1.0 Sep 10, 2014
 *
 * Copyright (c) 2014 HFDP
 */
package headfirst.seniorstudent2;

public interface Subject {

  public void notifyObservers();

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);
}
