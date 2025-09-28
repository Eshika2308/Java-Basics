package OOPS;

public class Factorial {
    public int factorial(int n){

        int factorial_output=1;
        for(int i = 1; i <=n ;i++)
        {
            factorial_output = factorial_output * i;
        }
        return factorial_output;
    }
}
//factorial_output = factorial_output *i;
//i =1    1 <= 10   = 1 * 1   1++  1
//i =2    2 <= 10   = 1 * 2   2++  2
//i =3    3 <= 10   = 2 * 3   3++  6
//i =4    4 <= 10   = 6 * 4   4++  24