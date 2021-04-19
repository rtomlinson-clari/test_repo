package what;

public interface CreditCardProcessor {
    ChargeResult charge(String order, String card);

    String getCardofOnlyCharge();

    int getAmountofOnlyCharge();
}
