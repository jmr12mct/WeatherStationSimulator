/**
 * 
 */
package com.weatherstation.interfaces;

/**
 * @author Mano_Jayamaran
 *
 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

}
