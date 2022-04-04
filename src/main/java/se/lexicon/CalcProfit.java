package se.lexicon;

public class CalcProfit {

  public static int getProfit(int costPerUnit, int pricePerUnit, int unitAmount){
    return (pricePerUnit * unitAmount) - (costPerUnit * unitAmount);
  }


}
