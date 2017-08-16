/**
 * 
 */
package com.weatherstation.test;

import com.weatherstation.observers.CurrentConditionsDisplay;
import com.weatherstation.observers.ForecastDisplay;
import com.weatherstation.observers.HeatIndexDisplay;
import com.weatherstation.observers.StatisticsDisplay;
import com.weatherstation.subject.WeatherData;

/**
 * @author Mano_Jayamaran
 *
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurementsChanged(80, 65, 30.4f);
		weatherData.setMeasurementsChanged(82, 68, 29.4f);
		weatherData.setMeasurementsChanged(75, 70, 29.4f);
	}

}
