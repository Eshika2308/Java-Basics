package OOPS;

public class Fizzbuzz {
    //If number is divisible by 3 and 5 - fizzbuzz
    //If only divisible by 3   - fizz
    //If only divisble by 5- buzz
    //If not divisible by any "not divisible"

    public void fizzBuzz(int n){
     if(n % 3 == 0 && n % 5 == 0)
     {
         System.out.println("fizzbuzz");
     } else if (n % 3 == 0) {
         System.out.println("fizz");
     } else if( n % 5 == 0)   {
         System.out.println("buzz");
     }
     else{
         System.out.println("not divisible");
        }
    }
}
