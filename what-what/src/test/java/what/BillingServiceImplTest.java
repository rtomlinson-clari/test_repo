package what;

import junit.framework.*;

public class BillingServiceImplTest extends TestCase {
    private final String order = "new PizzaOrder(100)";
    private final String creditCard = "new CreditCard('123', 11, 2010)";

    //private final InMemoryTransactionLog transactionLog = new InMemoryTransactionLog();
    private final FakeCreditCardProcessor processor = new FakeCreditCardProcessor();

    public void testSucessfulChange() {
        BillingServiceImpl billingService = new BillingServiceImpl(processor);
        Receipt receipt = billingService.chargeOrder(order, creditCard);

        assertTrue(receipt.hasSuccessfulCharge());
        assertEquals(100, receipt.getAmountOfCharge());
        assertEquals(creditCard, processor.getCardofOnlyCharge());
        assertEquals(100, processor.getAmountofOnlyCharge());
        //assertTrue(transactionLog.wasSuccessLogged());
    }
}