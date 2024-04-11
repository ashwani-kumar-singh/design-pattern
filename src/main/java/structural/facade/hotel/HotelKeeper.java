package structural.facade.hotel;

import structural.facade.menu.Menu;

import java.util.List;

public interface HotelKeeper {
    Menu getVegMenu();
    Menu getNonVegMenu();
    Menu getMixMenu();
}
