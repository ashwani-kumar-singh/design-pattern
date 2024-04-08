package behavioral.strategy;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ShoppingCart {
    private final PaymentStrategy paymentStrategy;
    private final List<Item> items;

    public ShoppingCart(PaymentStrategy paymentStrategy, List<Item> items) {
        this.paymentStrategy = paymentStrategy;
        this.items = items;
    }

    public void pay() {
        AtomicReference<Float> amount = new AtomicReference<>(0.0f);
        items.forEach(item -> amount.updateAndGet(v ->
                v + item.getPrice() * item.getQuantity()));
        paymentStrategy.pay(amount.get());
    }
}
