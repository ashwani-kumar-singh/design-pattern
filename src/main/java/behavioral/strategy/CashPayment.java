package behavioral.strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(float amount) {
        System.out.println("Cash On Delivery Payment: pay " + amount);
    }
}
