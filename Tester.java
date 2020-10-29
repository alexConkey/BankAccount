public class Tester {
  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount(7, "Password123");
    myAccount.deposit(100.00);
    System.out.println(myAccount.getBalance());
    System.out.println(myAccount.getAccountID());
    System.out.println(myAccount.toString());
  }
}
