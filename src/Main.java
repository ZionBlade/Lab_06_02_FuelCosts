import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String trash = "";
        double gallons = 0;
        double economy = 0;
        double price = 0;
        double distance = 0;
        double cost = 0;

        System.out.print("Enter the number of gallons of gas in your tank: ");
        if(in.hasNextDouble())
        {
            gallons = in.nextDouble();
            in.nextLine();

            System.out.print("Please enter the fuel efficiency of your car: ");
            if(in.hasNextDouble())
            {
                economy = in.nextDouble();
                in.nextLine();

                System.out.print("Please enter the price per gallon: ");
                if(in.hasNextDouble())
                {
                    price = in.nextDouble();
                    in.nextLine();
                    cost = (price / economy) * 100;
                    System.out.println("The cost to travel 100 miles would be: " + cost);

                    distance = gallons * economy;
                    System.out.println("On " + gallons + " gallons of gas, at " + economy + " miles per gallon, " +
                            "you can travel " + distance + " miles");
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println(trash + " is a bad input");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is a bad input");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is a bad input");
        }
    }
}