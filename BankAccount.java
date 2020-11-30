public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount (int a, String p) {
    a = accountID;
    p = password;
    balance = 0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String pass) {
    password = pass;
  }

  public boolean deposit (double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withDraw(double amount) {
    if (amount>=0 && amount <= balance) {
      balance -= amount;
      return true;
    }
    return false;
  }
}
