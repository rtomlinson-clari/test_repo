package what;

public class Receipt {
    public static Receipt forSuccessfulCharge(String order) {
        return new Receipt();
    }


    public static Receipt forDeclinedCharge(ChargeResult result) {
        return new Receipt();
    }

    public static Receipt forSystemFailure(String message) {
        return new Receipt();
    }

    public boolean hasSuccessfulCharge() {
        return true;
    }

    public int getAmountOfCharge() {
        return 100;
    }
}
