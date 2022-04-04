package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

  @Test
  public void test_deposit() {
    Account account = new Account();

    double depositAmount = 200;
    double expectedBalance = 200;

    account.deposit(depositAmount);
    Assert.assertEquals(expectedBalance, account.getBalance(), 0);
  }

  @Test
  public void test_withdraw() {
    Account account = new Account();
    account.deposit(200);

    double expectedBalance = 150;

    double actualBalance = account.withdraw(50);

    Assert.assertEquals(expectedBalance, actualBalance, 0);
  }
}
