package what;

public interface BillingService {
    /**
     * Attempts to charge the order to the credit card. Both successul and
     * failed transactions will be recorded.
     *
     * @ return a receipt of the transaction. If the charge was successful, the
     *  receipt will be successful. Otherwise, the receipt will contain a decline note describing why the charge failed.
     */
    Receipt chargeOrder(String order, String creditCard);
}
