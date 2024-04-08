package behavioral.strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(float amount) {
        // logic to pay using Card Details
        System.out.println("Card Payment: pay " + amount);
    }
}
