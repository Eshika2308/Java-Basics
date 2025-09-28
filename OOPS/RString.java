package OOPS;

public class RString {

    public String reversedString(String input){

        String reversed_s="";

        for(int i = input.length()-1; i >= 0; i--)
            //ATHARVA
            //( 6;6>=0;5) = A
            //5>=0;4  = v
            //4>=0 ;3 = R
            //3>=0 ;2 = A
            //2>=0 ;1 = H
            //1>=0 ;0 = T
            //0>=0 ;0 = A

        {
            reversed_s = reversed_s+input.charAt(i);
        }

        return reversed_s ;



    }
    //atharva = 7...0123456 (7-1)
    //i = 6 = a
    //i = 5
//    public void printNumbers()
//    {
//        for(int i =1; i< 6;i++){
//
//            System.out.println(i);
//            //i =1 i++
//            //i =2
//            //i<6 6<6
//        }
//    }

}
