package OOPS.withXamples;

import java.util.Scanner;

public class StudentReportCard {
     public static void main(String args[]){

         System.out.println("Enter Name and Roll.no : ");
         Scanner sc = new Scanner(System.in);
         String name = sc.next();
         int rollno = sc.nextInt();

         System.out.println("Enter marks of Subject Maths:");
         double  sub1 = sc.nextDouble();
         System.out.println("Enter marks of Subject Scinece:");
         double  sub2 = sc.nextDouble();
         System.out.println("Enter marks of Subject English:");
         double  sub3 = sc.nextDouble();

           Student st = new Student();
           double toatalMarks =  st.total(sub1,sub2,sub3);

         System.out.println("Total marks of all Subject: "+toatalMarks);
     }



}
class Student{
    String name;
    int Rollno;
    String[] subjects = {"Maths","Science","English"};


    public double total( double  sub1, double sub2, double sub3){
        double totalmarks = sub1+sub2+sub3;
        return totalmarks;
    }

}


