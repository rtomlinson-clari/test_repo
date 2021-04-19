package what;

public class BillingServiceImpl implements BillingService {
    private final CreditCardProcessor processor;

    public BillingServiceImpl(CreditCardProcessor processor) {
        this.processor = processor;
    }
    /**
     * Attempts to charge the order to the credit card. Both successful and
     * failed transactions will be recorded.
     *
     * @param order
     * @param creditCard
     * @ return a receipt of the transaction. If the charge was successful, the
     * receipt will be successful. Otherwise, the receipt will contain a decline note describing why the charge failed.
     */
    @Override
    public Receipt chargeOrder(String order, String creditCard) {

        try {
            ChargeResult result = processor.charge(creditCard, order);
            // transaction log

            return result.wasSuccessful()
                    ? Receipt.forSuccessfulCharge(order)
                    : Receipt.forDeclinedCharge(result);
        } catch (Exception e) {
            // transaction log
            return Receipt.forSystemFailure(e.getMessage());
        }
    }
}
