package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Strategy Design Pattern: It helps you to define a family of algorithm and we can select the algorithm
 * at run time depending on the situation
 * <p>
 * <a href="https://www.geeksforgeeks.org/strategy-pattern-set-1/">...</a>
 */
public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Soap", 4, 30));
        items.add(new Item("Toothpaste", 1, 70));
        items.add(new Item("Detergent", 2, 150));

        ShoppingCart shoppingCart = new ShoppingCart(new CardPayment(), items);
        shoppingCart.pay();

        shoppingCart = new ShoppingCart(new UPIPayment(), items);
        shoppingCart.pay();

        shoppingCart = new ShoppingCart(new CashPayment(), items);
        shoppingCart.pay();
    }
}
