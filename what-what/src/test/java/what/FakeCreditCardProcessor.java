package what;

public class FakeCreditCardProcessor implements CreditCardProcessor{

    @Override
    public ChargeResult charge(String order, String card) {
        return null;
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
