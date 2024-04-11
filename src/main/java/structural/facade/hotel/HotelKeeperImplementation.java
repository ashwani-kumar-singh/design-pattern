package structural.facade.hotel;

import structural.facade.menu.Menu;
import structural.facade.restaurant.MixRestaurant;
import structural.facade.restaurant.NonVegRestaurant;
import structural.facade.restaurant.VegRestaurant;

public class HotelKeeperImplementation implements HotelKeeper {

    @Override
    public Menu getVegMenu() {
        return new VegRestaurant().getMenus();
    }

    @Override
    public Menu getNonVegMenu() {
        return new NonVegRestaurant().getMenus();
    }

    @Override
    public Menu getMixMenu() {
        return new MixRestaurant().getMenus();
    }
}
