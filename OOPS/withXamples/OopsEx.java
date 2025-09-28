package OOPS.withXamples;


import java.util.Scanner;

//WAP basic class called BankBalance that performs below activities:
//1. getBalance() -> returns account balance.
//2. deposit() -> add amount to balance
//3. withdraw() -> withdraw amount from balance.
//create object in main class and take user input.
public class OopsEx {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intial balance to add in account : ");
        double intialAmount = sc.nextDouble();

        //parameterized constructor runs by itself  when object is created
        //can assign a value at the time of creation on and object
        //user given amount is saved
       BankBalance bb = new BankBalance(intialAmount);


        System.out.println("Balance : " + bb.getBalance());
    
//        bb.deposit(1000);
//        System.out.println("Balance : " + bb.getBalance());
         System.out.println("Enter amount to be withdraw : ");
         double withdrawAmount = sc.nextDouble();
         bb.withdrawl(withdrawAmount);//1000
        System.out.println("Balance : " + bb.getBalance());
    }
}
