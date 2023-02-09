import java.util.UUID;

public class HdfcAccount implements CommonThings{
    private String Name;
    private String AccountNo;
    private double rateOfInterest;
    private String Password;
    private int balance;

    public HdfcAccount(String name, String password, int balance) {
        Name = name;
        Password = password;
        this.balance = balance;

        this.rateOfInterest = 8.5;
        this.AccountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
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

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public String Deposit(int amount) {
        this.balance +=amount;
        return "You Succesfully Deposited tha Amount: "+amount;
    }

    @Override
    public double CalculaterateOfInterest(int time) {
        return (balance * time * rateOfInterest)/100.0;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {
        if(enteredPassword.equals(Password))
        {
            if(amount > balance) return "Insuffient Funds";
            else {
                this.balance -= amount;
                return "Hey U successfully WithDrawn: "+amount;
            }
        }
        return "Wrong Password Guru";
    }
}
