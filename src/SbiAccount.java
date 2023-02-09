import java.util.UUID;

public class SbiAccount implements CommonThings{
    private String Name;
   private  String AccountNum;

    private String Password;

    private int balance;

    private double rateOfInterest;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(String accountNum) {
        AccountNum = accountNum;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public SbiAccount(String name,  String password, int balance) {
        Name = name;
        Password = password;
        this.balance = balance;

        this.rateOfInterest = 6.6;
        AccountNum = String.valueOf(UUID.randomUUID());
    }

    @Override
    public int getBalance() {
        return balance;
    }



    @Override
    public String Deposit(int amount) {
        this.balance +=amount;
        return "Hey U Successfully Deposited of Amount: "+amount;
    }

    @Override
    public double CalculaterateOfInterest(int time) {
        return (this.balance * rateOfInterest * time)/100.0;
    }

    @Override
    public String withdraw(int amount,String enteredPassword) {
        if(enteredPassword.equals(Password))
        {
            if(amount <= balance)
            {
                this.balance -=amount;
                return "Hey U withdrawn :"+amount+"  Amount";
            }
            else
            {
                return "Insufficient Bruh";
            }
        }
        return "Password is Wrong Bruh";
    }
}
