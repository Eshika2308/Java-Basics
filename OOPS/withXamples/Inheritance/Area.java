package OOPS.withXamples.Inheritance;


import java.util.Scanner;

 class Shape{
    public void area(){
        System.out.println("Calculates Area: ");
    }
}
class Circle extends Shape{
    //3.14 * r*r
      public double area(double radius){          //MethodOverloading -Compile time
//      // double areaOfCircle = 3.14 * radius* radius;
//      // return areaOfCircle;
        return 3.14 * radius* radius;
    }


}
class Rectangle{
    public double area(double length, double breath){//Same name,different parameters
        double areaOfRectangle =  length* breath;
        return areaOfRectangle;
    }
}
class Square{
    public double area(double s){
        double areaOfSquare = s*s;
        return areaOfSquare;
    }
}
public class Area {
    public static void main(String args[]){
        Shape shape = new Shape();
        shape.area();

        System.out.println("Enter Radius Of Circle: ");
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();

        Circle c  = new Circle();
        double areaOfCircle = c.area(input);
        System.out.println("Area Of Circle: " + areaOfCircle);

//---------------------------------------------------
        System.out.println("Enter Length and Breath :");
        double inputLength = sc.nextInt();
        double inputBreath = sc.nextInt();

        Rectangle r = new Rectangle();
        //Static values are passed
        //double areaOfRectangle = r.area(12,15);
        double areaOfRectangle =r.area(inputLength,inputBreath);
        System.out.println("Area of Rectangle: "+areaOfRectangle);
//-----------------------------------------------------------------
        System.out.println("Enter side of square: ");
         double inputSide = sc.nextDouble();
         Square s = new Square();
         double areaOfSquare=s.area(inputSide);

        System.out.println("Area of Square: "+areaOfSquare);
    }



}
