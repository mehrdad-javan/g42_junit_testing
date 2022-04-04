package se.lexicon;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  // annotation for test
  @Test
  public void test_isAdult_true(){
    int age = 18;
    boolean result = App.isAdult(age);
    Assert.assertTrue(result);
  }

  @Test
  public void test_isAdult_false(){
    Assert.assertFalse(App.isAdult(5));
  }

}
