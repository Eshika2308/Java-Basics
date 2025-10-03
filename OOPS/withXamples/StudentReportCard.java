package OOPS.withXamples;

import java.util.Scanner;


/*Create a class Student with fields: name, rollNo, and marks (array of 3 subjects).
Take input for a student. as enter name then, enter rollNO, then enter subject1 marks,
subject2 marks, subject3 marks.
Add methods to:
Calculate total and average marks.
Print student details with average.
Practice constructors, methods, and encapsulation (private fields with getters/setters).*/
public class StudentReportCard {
     public static void main(String args[]){

         System.out.println("Enter Name and Roll.no : ");
         Scanner sc = new Scanner(System.in);
         String name = sc.next();
         int rollno = sc.nextInt();

         System.out.println("Enter marks of Subject Maths:");
         double  sub1 = sc.nextDouble();
         System.out.println("Enter marks of Subject Science:");
         double  sub2 = sc.nextDouble();
         System.out.println("Enter marks of Subject English:");
         double  sub3 = sc.nextDouble();

           Student st = new Student();
           double totalMarks =  st.total(sub1,sub2,sub3);

         System.out.println("Total marks of all Subject: "+totalMarks);


         double  average = st.average(sub1,sub2,sub3);
         System.out.println("average of all Subject: "+average);

     }



}
class Student{

    String[] marks = {"Maths","Science","English",};


    public double total( double  sub1, double sub2, double sub3){
        double totalmarks = sub1+sub2+sub3;
        return totalmarks;
    }
    public double average(double sub1,double sub2 , double sub3){
        double average = (sub1+sub2+sub3)/marks.length;
        return average;
    }

}



