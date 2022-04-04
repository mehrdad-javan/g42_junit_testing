package se.lexicon;

public class Account {

  private double balance;


  public void deposit(double amount) {
    if (amount > 0) {
      this.balance = this.balance + amount;
    }
  }

  public double getBalance(){
    return this.balance;
  }

  public double withdraw(double amount){
    // step1: check the amount should be > 0
    if (amount <= 0){
      return -1;
    }
    if ( (this.balance - amount) > 0){
      this.balance = this.balance - amount;
    }
    return this.balance;
  }




}
