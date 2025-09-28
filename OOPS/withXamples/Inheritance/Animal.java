package OOPS.withXamples.Inheritance;

public class Animal {

    public void Sound(){
        System.out.println("Animal makes a Sound : ");
    }
}
 class Dog extends Animal
 {
   public void Sound(){

       System.out.println("Dog Barks"); //method overiding
   }
 }
class Cat extends Animal
{
    public void Sound(){
        System.out.println("Cat Mews");//Same name same syntax same parameters
    }
}