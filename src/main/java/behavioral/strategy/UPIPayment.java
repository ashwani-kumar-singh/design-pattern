package behavioral.strategy;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void pay(float amount) {
        // logic to pay using UPI
        System.out.println("UPI Payment: pay " + amount);
    }
}
