public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constants to define expected range or value types
    private static final double MILES_PER_CASH = 0.0035;
    private static final double CASH_PER_MILE = 1 / MILES_PER_CASH; // Approximately 285.714

    // Single constructor assuming differentiation based on a threshold or pattern
    public RewardValue(double value) {
        // Assuming that value types can be distinguished (e.g., cash values are typically less than 1000 and miles values are much larger)
        // This is a risky assumption and should be replaced with a more reliable method if possible
        if (value < 1000) { // Assuming it's cash
            this.cashValue = value;
            this.milesValue = convertCashToMiles(value);
        } else { // Assuming it's miles
            this.milesValue = value;
            this.cashValue = convertMilesToCash(value);
        }
    }

    private double convertCashToMiles(double cash) {
        return cash * MILES_PER_CASH;
    }

    private double convertMilesToCash(double miles) {
        return miles * CASH_PER_MILE;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return this.milesValue;
    }

}

