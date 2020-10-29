public class BankAccount{
  double balanceDouble = 0;
  int accountInt = 0;
  String passwordStr = "";
  public BankAccount(int accountId, String password){
    accountInt = accountId;
    passwordStr = password;
  }
  public double getBalance(){
    return balanceDouble;
  }
  public int getAccountID(){
    return accountInt;
  }
  public void setPassword(String newPass){
    passwordStr = newPass;
  }
  public boolean deposit(double ammount){
    
  }
}
