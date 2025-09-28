package OOPS.withXamples;


//Write a basic class called BankBalance that performs below activities:
//1. getBalance() -> returns account balance.
//2. deposit() -> add amount to balance
//3. withdraw() -> withdraw amount from balance.
//create object in main class and take user input.


public class BankBalance {

    private double balance;//not intialized

    public BankBalance(){
        //    System.out.println("default constructor");
    }
    //constructor only intializes b=value of variables when obj is created
        public BankBalance(double intialAmount){

            this.balance = intialAmount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }
    public void deposit(int depositValue){
        balance = depositValue + balance;
        System.out.println("Amount deposited : "+depositValue);
    }
    //implementation
    public void withdrawl(double amount)//1000
    {
        if(balance < amount){
            System.out.println("Insufficient balance!");
        }
        else {
            balance  = balance - amount;
            System.out.println("Amount withdrawl : "+amount);
        }

    }


}
