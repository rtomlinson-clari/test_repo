package what;

public class PaypalCreditCardProcessor implements CreditCardProcessor{
    @Override
    public ChargeResult charge(String order, String card) {
        return new ChargeResult();
    }
    @Override
    public String getCardofOnlyCharge() {
        return "hello";
    }
    @Override
    public int getAmountofOnlyCharge() {
        return 1;
    }
}
