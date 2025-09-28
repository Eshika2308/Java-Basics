package OOPS;

import java.util.ArrayList;

public class EvenNumbers {
    public void printEvenNumbers(int n) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        System.out.println("Even numbers are"+ evenNumbers);

    }
    public void printOddNumbers(int o)
    {
        ArrayList<Integer> oddNumbers =  new ArrayList<>();
        for(int i = 1 ;i<= o; i++ )
        {
            if (i %2 != 0)
            {
              oddNumbers.add(i);

            }
        }
        System.out.println("List of Odd numbers"+ oddNumbers);
    }
}
/*
*  n =20
* i =2
* 1<= 20
* 1%2 =1
*
* 2%2 =0
* 3%2 =1
* 4%2 =0
* 5%2 =1
*  */
