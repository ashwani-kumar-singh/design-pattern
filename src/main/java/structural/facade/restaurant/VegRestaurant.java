package structural.facade.restaurant;

import structural.facade.menu.Menu;

import java.util.Arrays;
import java.util.List;

public class VegRestaurant implements Restaurant {

    @Override
    public Menu getMenus() {
        return new Menu(Arrays.asList("dal tadka", "paneer butter masala"));
    }
}
