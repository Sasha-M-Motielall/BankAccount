public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount(87654321, "Account");
    System.out.println(ba.getBalance());
    System.out.println(ba.getAccountID());
  }
}
