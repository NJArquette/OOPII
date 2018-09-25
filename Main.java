/*Nathaniel Arquette
*class project
*The goal of this piece of code is to 
*show an understanding of using file extensions
*and overrides
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//what do we want?
        System.out.println("Please enter a basic color to test.");
        Scanner sc = new Scanner(System.in);
        String test = sc.next();

        //tell em what they entered
        Test(test);

        //we want more
        System.out.println("Please enter another basic color to test.");
        String test2 =sc.next();

        //tell em what they entered
        Test(test2);

        //magic is gonna happen!
        System.out.println("Mixing colors.");

        Test call = new Test();
        call.Test(test, test2);
    }

    //this is how we tell them what they entered
    private static void Test(String test) {

        
        //primary
        if (test.equalsIgnoreCase("blue")||
                test.equalsIgnoreCase("red")||
                test.equalsIgnoreCase("yellow"))
        {System.out.println(test + " is a primary color.");}
        else System.out.println(test + " is not a primary color.");

        //cool
        if (test.equalsIgnoreCase("blue")||
                test.equalsIgnoreCase("green")||
                test.equalsIgnoreCase("purple"))
        {System.out.println(test + " is a cool color.");}
        else System.out.println(test + " is not a cool color.");

        //warm
        if (test.equalsIgnoreCase("red")||
                test.equalsIgnoreCase("yellow")||
                test.equalsIgnoreCase("orange"))
        {System.out.println(test + " is a warm color.");}
        else System.out.println(test + " is not a warm color.");
    }
}
