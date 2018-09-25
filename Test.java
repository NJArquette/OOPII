public class Test extends Main {

    public static void Test(String test, String test2) {

        //holder
        String result = "white";

        //blue
        if (test.equalsIgnoreCase("blue") && test2.equalsIgnoreCase("red"))
        {result = "purple";}
         else if (test.equalsIgnoreCase("blue") && test2.equalsIgnoreCase("green"))
        {result = "blue-green";}
        else if (test.equalsIgnoreCase("blue") && test2.equalsIgnoreCase("yellow"))
        {result = "green";}
        else if (test.equalsIgnoreCase("blue") && test2.equalsIgnoreCase("purple"))
        {result ="violet";}
        else if (test.equalsIgnoreCase("blue") && test2.equalsIgnoreCase("orange"))
        {result ="brown";}

        //red
        else if (test.equalsIgnoreCase("red") && test2.equalsIgnoreCase("green"))
        {result ="brown";}
        else if (test.equalsIgnoreCase("red") && test2.equalsIgnoreCase("yellow"))
        {result ="orange";}
        else if (test.equalsIgnoreCase("red") && test2.equalsIgnoreCase("purple"))
        {result ="maroon";}
        else if (test.equalsIgnoreCase("red") && test2.equalsIgnoreCase("orange"))
        {result ="red-orange";}
        else if (test.equalsIgnoreCase("red") && test2.equalsIgnoreCase("blue"))
        {result = "purple";}

       //green
        else if (test.equalsIgnoreCase("green") && test2.equalsIgnoreCase("yellow"))
        {result ="yellow-green";}
        else if (test.equalsIgnoreCase("green") && test2.equalsIgnoreCase("purple"))
        {result ="grey";}
        else if (test.equalsIgnoreCase("green") && test2.equalsIgnoreCase("orange"))
        {result ="bronze";}
        else if (test.equalsIgnoreCase("green") && test2.equalsIgnoreCase("red"))
        {result = "brown";}
        else if (test.equalsIgnoreCase("green") && test2.equalsIgnoreCase("blue"))
        {result = "blue-green";}

        //purple
        else if (test.equalsIgnoreCase("purple") && test2.equalsIgnoreCase("orange"))
        {result ="reddish-brown";}
        else if (test.equalsIgnoreCase("purple") && test2.equalsIgnoreCase("yellow"))
        {result ="tan-brown";}
        else if (test.equalsIgnoreCase("purple") && test2.equalsIgnoreCase("red"))
        {result = "maroon";}
        else if (test.equalsIgnoreCase("purple") && test2.equalsIgnoreCase("blue"))
        {result = "violet";}
        else if (test.equalsIgnoreCase("purple") && test2.equalsIgnoreCase("green"))
        {result = "grey";}

        //yellow
        else if (test.equalsIgnoreCase("yellow") && test2.equalsIgnoreCase("orange"))
        {result ="gold";}
        else if (test.equalsIgnoreCase("yellow") && test2.equalsIgnoreCase("red"))
        {result = "orange";}
        else if (test.equalsIgnoreCase("yellow") && test2.equalsIgnoreCase("blue"))
        {result = "green";}
        else if (test.equalsIgnoreCase("yellow") && test2.equalsIgnoreCase("green"))
        {result = "yellow-green";}
        else if (test.equalsIgnoreCase("yellow") && test2.equalsIgnoreCase("purple"))
        {result = "tan-brown";}

        //mixed color
        System.out.println(test + " and " + test2 + " mixed together make " + result);
    }
}