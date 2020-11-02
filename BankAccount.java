public class BankAccount{
  double balanceDouble = 0.00;
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
    return "#" + String.valueOf(accountInt) + "\t$" + String.valueOf(balanceDouble);
  }
  public boolean authenticate(String password){
    return (passwordStr == password);
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password)){
      return (withdraw(amount) && other.deposit(amount));
    }
    return false;
  }
}
