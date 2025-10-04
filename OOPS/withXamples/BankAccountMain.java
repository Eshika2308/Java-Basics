package OOPS.withXamples;

import java.util.Scanner;

class BankAccount{
    double accNo ;
    String holderName;
    int balance;

    public BankAccount(){

    }
    public String getHolderName(){
        return holderName;
    }
    public void setHolderName(String holderName1) {
        this.holderName = holderName1;
    }
    public double getAccNo(){
        return accNo;
    }
    public void setAccNo(double AccNo1){
        this.accNo = AccNo1;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(int balance1){
        balance=balance1;
    }
    public void Display() {
        System.out.println("Holders Name : " + this.holderName);
        System.out.println("Account.No : " + this.accNo);
        System.out.println("Account Balance :" + this.balance);
    }
    public void deposit(int depositValue)
    {
       // int balance =  depositValue + balance;
        System.out.println("Amount deposited : "+depositValue);

    }
    public void withdrawl(int amount)//1000
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


public class BankAccountMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String inputName = sc.next();
        System.out.println("Enter AccountNo:");
        int inputAccNo = sc.nextInt();
        System.out.println("Enter Initial Balance:");
        int inputInitialBalance = sc.nextInt();

        BankAccount ba = new BankAccount();
        ba.setHolderName(inputName);
        ba.setAccNo(inputAccNo);
        ba.setBalance(inputInitialBalance);
        ba.Display();

    }

}
