package behavioral.template;

public class IndividualPaymentFlow extends PaymentFlow {
    @Override
    void validateRequest() {
        //logic for individual payment flow validation
        System.out.println("Individual Payment Flow validation");
    }

    @Override
    float calculateCharges(float amount) {
        //logic to calculate charge for individual payment
        if (amount > 100000)
            return (amount / 10000) * 25;
        else
            return (amount / 100) * 0.15f;
    }
}
