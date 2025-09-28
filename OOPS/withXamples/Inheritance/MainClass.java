package OOPS.withXamples.Inheritance;

import java.util.Scanner;

public class MainClass {
    public static void main(String args[]){
        System.out.println("Enter Animal: DOG /CAT");
        Scanner sc = new Scanner(System.in);
        String inputAnimal = sc.next();
        //RUNTIME POLYMORPHISM : Code flow depends on runtime input
        if (inputAnimal.equalsIgnoreCase("DOG")){
           Dog d = new Dog();
           d.Sound();
        }else if (inputAnimal.equalsIgnoreCase("CaT")){
            Cat c = new Cat();
            c.Sound();
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
