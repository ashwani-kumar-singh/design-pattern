package structural.facade.restaurant;

import structural.facade.menu.Menu;

import java.util.Arrays;
import java.util.List;

public class NonVegRestaurant implements Restaurant {

    @Override
    public Menu getMenus() {
        return new Menu(Arrays.asList("roasted chicken", "butter chicken"));
    }
}
