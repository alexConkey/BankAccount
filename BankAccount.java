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
  public boolean deposit(double amount){
    if (amount > 0){
      balanceDouble += amount;
      return true;
    }
    return false;
  }
  public boolean withdraw(double amount){
    if (amount > 0 && balanceDouble >= amount){
      balanceDouble -= amount;
      return true;
    }
    return false;
  }
  public String toString(){
    return String.valueOf(accountInt) + "\t" + String.valueOf(balanceDouble);
  }
}
