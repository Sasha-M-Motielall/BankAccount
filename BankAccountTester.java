public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount b = new BankAccount(12345678, "My Account");
    System.out.println(b.getBalance());
    System.out.println(b.getAccountID());
  }
}
