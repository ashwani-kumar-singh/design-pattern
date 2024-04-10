package behavioral.observer;

import behavioral.observer.observable.WeatherStation;

/**
 * Observer Design Pattern: In this object(Observable) maintains list of it's dependent (observers)
 * and notifies them of any changes in state. It's kind of subscription mechanism
 *
 * @link: <a href="https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/">...</a>
 */
public class Client {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new MobileObserver());
        System.out.println("*********** After adding Mobile Observer **********");
        weatherStation.setWeather("35C");

        TVObserver tvObserver = new TVObserver();
        weatherStation.addObserver(tvObserver);
        System.out.println("************* After adding TV Observer ***********");
        weatherStation.setWeather("32C");

        weatherStation.removeObserver(tvObserver);
        System.out.println("************ After removing TV Observer ***********");
        weatherStation.setWeather("29C");

    }
}
