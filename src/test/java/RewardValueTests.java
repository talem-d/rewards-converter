import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double milesToCashValue = 3.5 ;
        int milesValue = 1000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesToCashValue, rewardValue.getCashValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        int cashTMV = 1000;
        double cashVal = 3.5;
        var rewardVal = new RewardValue(cashVal);
        assertEquals(cashTMV, rewardVal.getMilesValue());
    }
}
