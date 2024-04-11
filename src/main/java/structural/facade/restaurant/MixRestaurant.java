package structural.facade.restaurant;

import structural.facade.menu.Menu;

import java.util.Arrays;
import java.util.List;

public class MixRestaurant implements Restaurant {

    @Override
    public Menu getMenus() {
        return new Menu(Arrays.asList("dal tadka", "fried chicken"));
    }
}
