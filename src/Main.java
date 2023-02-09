import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Hello BlockBuster Bank!");


        System.out.println("Hey U wanna Create AN Account:then enter Your Name");
        String name = sc.next();
        System.out.println("Set The Password: ");
        String password = sc.next();
        System.out.println("Deposit the amount U wanted to: ");
        int balance = sc.nextInt();

        SbiAccount sbi = new SbiAccount(name,password,balance);

        System.out.println("Hey U created Ur Account Successfully with this Account No: "+sbi.getAccountNum());

        System.out.println("With this name : "+sbi.getName());
        System.out.println("and with this balance: "+sbi.getBalance());
        System.out.println("Hey Deposit the amount u wanted: ");
        int deposit = sc.nextInt();

        sbi.Deposit(deposit);

        System.out.println("Total Balnace after Depostit: "+sbi.getBalance());
        System.out.println("You wanna withdraw: enter amount");
        int amount = sc.nextInt();
        System.out.println("Enter Password");
        String Password = sc.next();

        System.out.println(sbi.withdraw(amount,Password));

        System.out.println("Total balance: "+sbi.getBalance());
        System.out.println("Hey wanna u know calculated Interest : then enter time in years: ");
        int time = sc.nextInt();
        System.out.println("CalculatedInterest with the available balance : "+sbi.getBalance()+" is"+sbi.CalculaterateOfInterest(time));
*/
        boolean flag = true;
        while(flag == true) {
            System.out.println("Welcome To HDFC BANK");
            System.out.println("Hey U wanna Create a Bank Account in HDFC:  then write your name");
            String name = sc.next();

            System.out.println("Set your Password : ");
            String password = sc.next();

            System.out.println("Set the Balance :");
            int bal = sc.nextInt();

            HdfcAccount hdfc = new HdfcAccount(name, password, bal);

            System.out.println("Hey U successfully Created AN Account");
            System.out.println("Your Name: " + hdfc.getName());
            System.out.println("Your generated AccountNo: " + hdfc.getAccountNo());



            System.out.println("hey please go through the features we have for you: ");

            int key = Integer.MAX_VALUE;

            while (key != 0)
            {
                System.out.println("Press 1 to know your Account Balance: ");
                System.out.println("Press 2 to Deposit: ");
                System.out.println("Press 3 to withdraw: ");
                System.out.println("Press 4 to calculate the rate of Interest: ");
                System.out.println("Press 0 for exit: ");
                key = sc.nextInt();

                if(key == 1)
                {
                    System.out.println("Your Balance as of Now: "+hdfc.getBalance());
                }
                else if(key == 2)
                {
                    System.out.println("Please write the amount u wanted to deposit: ");
                    int amount = sc.nextInt();
                    System.out.println(hdfc.Deposit(amount));
                    System.out.println("after Deposit your Balance is :"+hdfc.getBalance());

                }
                else if(key == 3)
                {
                    System.out.println("Please write the amount u wanna withdraw: ");
                    int money =sc.nextInt();
                    String pass = sc.next();
                    System.out.println(hdfc.withdraw(money,pass));
                    System.out.println("After withdrwal Your left amiunt is : "+hdfc.getBalance());
                }
                else if(key == 4)
                {
                    System.out.println("our Interest rate is: "+hdfc.getRateOfInterest());
                    System.out.println("Please write the time in years: ");
                    int time =sc.nextInt();
                    System.out.println("Calculated Intersest is :   "+hdfc.CalculaterateOfInterest(time));

                }
                else {
                    break;
                }
            }
        }






    }
}