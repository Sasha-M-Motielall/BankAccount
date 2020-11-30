public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount(87654321, "Account");
    System.out.println(ba.getBalance());
    System.out.println(ba.getAccountID());

    System.out.println();

    System.out.println(ba.deposit(123.45));
    System.out.println(ba.getBalance());
    System.out.println(ba.deposit(-12.34));
    System.out.println(ba.getBalance());

    System.out.println();

    System.out.println(ba.withDraw(10.00));
    System.out.println(ba.getBalance());
    System.out.println(ba.withDraw(1000.00));
    System.out.println(ba.getBalance());
  }
}
