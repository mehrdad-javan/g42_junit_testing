package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

public class CalcProfitTest {

  @Test
  public void test_getProfit_returns_expected_profit() {
    int costPerItem = 10;
    int pricePerItem = 25;
    int givenAmount = 10;

    int expectedProfit = 150;

    int actualProfit = CalcProfit.getProfit(costPerItem, pricePerItem, givenAmount);

    Assert.assertEquals(expectedProfit,actualProfit);
  }

}
