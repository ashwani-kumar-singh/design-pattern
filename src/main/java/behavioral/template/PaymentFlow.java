package behavioral.template;

public abstract class PaymentFlow {
    abstract void validateRequest();

    abstract float calculateCharges(float amount);

    void debit(float amount, float charges) {
        float total = amount + charges;
        System.out.println("Amount debited: " + total);
    }

    void credit(float amount) {
        System.out.println("Amount credited: " + amount);
    }

    // note: we need to make it final so that it can't be overridden by it's subclasses
    public final void transferMoney(float amount) {
        validateRequest();
        float charges = calculateCharges(amount);
        debit(amount, charges);
        credit(amount);
    }

}
