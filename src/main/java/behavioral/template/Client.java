package behavioral.template;

/**
 * Template Design Pattern: defines the skeleton of an algorithm in a superclass but allows subclasses
 * to override specific steps of the algorithm without changing its structure.
 *
 * @Link: https://www.geeksforgeeks.org/template-method-design-pattern/
 */
public class Client {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new IndividualPaymentFlow();
        paymentFlow.transferMoney(1000000);

        paymentFlow = new MerchantPaymentFlow();
        paymentFlow.transferMoney(1000000);
    }
}
