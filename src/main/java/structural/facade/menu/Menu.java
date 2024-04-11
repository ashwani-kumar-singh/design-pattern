package structural.facade.menu;

import java.util.List;

public class Menu {
    List<String> dishes;

    public Menu(List<String> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "dishes=" + dishes +
                '}';
    }
}
