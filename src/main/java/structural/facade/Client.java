package structural.facade;

import structural.facade.hotel.HotelKeeper;
import structural.facade.hotel.HotelKeeperImplementation;

/**
 * Facade Method Design Pattern provides a unified interface to a set of interfaces in a subsystem.
 * Facade defines a high-level interface that makes the subsystem easier to use.
 * It is used to hide the system complexity from the client.
 *
 * @link: <a href="https://www.geeksforgeeks.org/facade-design-pattern-introduction/">...</a>
 */
public class Client {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeperImplementation();

        System.out.println("Veg Menu: " + hotelKeeper.getVegMenu());

        System.out.println("Mix Menu: " + hotelKeeper.getMixMenu());

        System.out.println("Non Veg Menu: " + hotelKeeper.getNonVegMenu());
    }


}
