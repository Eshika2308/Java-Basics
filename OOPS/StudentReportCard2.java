package OOPS;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Create a class Student with fields: name, rollNo, and marks (array of 3 subjects).
Take input for a student. as enter name then, enter rollNO, then enter subject1 marks,
subject2 marks, subject3 marks.
Add methods to:
Calculate total and average marks.
Print student details with average.
Practice constructors, methods, and encapsulation (private fields with getters/setters).*/
class StudentDetails {
    private String name;
    private int rollNo;
    private int[] marks = new int [3];

    public StudentDetails()
    {

    }
    //Constructor to intialize
    public StudentDetails(String name, int rollNo, int[] marks){
       this.name = name;
       this.rollNo = rollNo;
       this.marks= marks;
    }
    //use of getter and setter
    public String getName()
    {
        return name;
    }
    public void setName(String name1)
    {
        this.name = name1;

    }

    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo1){
        this.rollNo = rollNo1;
    }

   public int[] getMarks()
   {
       return marks;
   }
   public void  setMarks( int[] marks1){
        this.marks = marks1;

   }

   public void Display(){
       System.out.println("Name : "+ this.name);
       System.out.println("Roll.No : "+ this.rollNo);
       System.out.println("Marks of English, Maths and Science:");
       for (int i = 0; i < marks.length ; i++){
           System.out.print(marks[i]+" ");
       }
       System.out.println();
   }
    public int totalMarks()
    {
        int totalMark = marks[0]+marks[1]+marks[2];
        return totalMark;
    }
    public int average(){
        int av = totalMarks()/marks.length;
        return av;
    }

}
public class StudentReportCard2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and Roll no");
        String name =  sc.next();
        int rollNo = sc.nextInt();


        System.out.println("Enter English Subject marks:");
        int EngMarks = sc.nextInt();
        System.out.println("Enter Maths Subject marks:");
        int MathsMarks = sc.nextInt();
        System.out.println("Enter Science Subject marks:");
        int SciMarks = sc.nextInt();

        int[] marks = new int[3];
        marks[0] =  EngMarks;
        marks[1] =  MathsMarks;
        marks[2] =  SciMarks;

        StudentDetails sd = new StudentDetails();
        sd.setName(name);// setting the user input in name variable of Student details
        sd.setRollNo(rollNo);
        sd.setMarks(marks);

        sd.Display();
        System.out.println("Total marks of Subjects:"+ sd.totalMarks());
        System.out.println("Average marks of Subjects:"+ sd.average());


    }
}
