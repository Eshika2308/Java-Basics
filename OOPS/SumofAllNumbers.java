package OOPS;

public class SumofAllNumbers {

    public int sumOfAllNumber(int n){
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum = sum + i;
        }
        return sum;
    }

}
//                           sum = sum+i
//sum = 0     i=1     1 <= 20  sum = 0+1      sum =1;
//sum = 1     i=2     2 <= 20  sum = 1+2      sum =3;
//sum = 3     i=3     3 <= 20  sum = 3+3      sum =6;
//sum = 6     i=4     4 <= 20  sum = 6+4      sum =10;
//sum = 10    i=5     5 <= 20  sum = 5+10     sum =15