package behavioral.template;

public class MerchantPaymentFlow extends PaymentFlow {
    @Override
    void validateRequest() {
        //logic for merchant payment flow validation
        System.out.println("Merchant Payment Flow validation");
    }

    @Override
    float calculateCharges(float amount) {
        //logic to calculate charge for merchant payment
        if (amount > 100000)
            return (amount / 10000) * 50;
        else
            return (amount / 100) * 0.35f;
    }

}
