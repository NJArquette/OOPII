import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter a basic color to test.");
        Scanner sc = new Scanner(System.in);
        String test = sc.next();

        Test(test);

        System.out.println("Please enter another basic color to test.");
        String test2 =sc.next();

        Test(test2);

        System.out.println("Mixing colors.");

        Test call = new Test();
        call.Test(test, test2);
    }

    private static void Test(String test) {

        if (test.equalsIgnoreCase("blue")||
                test.equalsIgnoreCase("red")||
                test.equalsIgnoreCase("yellow"))
        {System.out.println(test + " is a primary color.");}
        else System.out.println(test + " is not a primary color.");

        if (test.equalsIgnoreCase("blue")||
                test.equalsIgnoreCase("green")||
                test.equalsIgnoreCase("purple"))
        {System.out.println(test + " is a cool color.");}
        else System.out.println(test + " is not a cool color.");

        if (test.equalsIgnoreCase("red")||
                test.equalsIgnoreCase("yellow")||
                test.equalsIgnoreCase("orange"))
        {System.out.println(test + " is a warm color.");}
        else System.out.println(test + " is not a warm color.");
    }
}
