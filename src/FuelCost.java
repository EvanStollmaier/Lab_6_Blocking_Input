import java.util.Scanner;

public class FuelCost
{
    static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.0;
        double miles100Cost = 0.0; // (100 / milesPerGallon) * pricePerGallon
        double fullTankDistance = 0.0; // tankSize * milesPerGallon

        boolean done = false;
        String trash = "";
        do
        {
            System.out.println("Enter the size of the gas tank in gallons: ");
            if (in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();
                if (tankSize <= 0)
                {
                    System.out.println("Tank size must be greater than zero. Please try again.");
                } else
                {
                    done = true;
                }
            } else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        }while (!done);
        done = false;  //  Reset for next input

        do
        {
            System.out.println("Enter the miles per gallon: ");
            if (in.hasNextDouble())
            {
                milesPerGallon = in.nextDouble();
                in.nextLine();
                if (milesPerGallon <= 0)
                {
                    System.out.println("Miles per gallon must be greater than zero. Please try again.");
                } else
                {
                    done = true;
                }
            } else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        }while (!done);
        done = false;  //  Reset for next input

        do
        {
            System.out.println("Enter the price per gallon: ");
            if (in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                if (pricePerGallon <= 0)
                {
                    System.out.println("Price per gallon must be greater than zero. Please try again.");
                } else
                {
                    done = true;
                }
            } else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        }while (!done);

        miles100Cost = (100.0 / milesPerGallon) * pricePerGallon;
        fullTankDistance = tankSize * milesPerGallon;

        System.out.printf("The cost to drive 100 miles is $%.2f%n", miles100Cost);
        System.out.printf("The distance that can be driven on a full tank is %.1f miles%n", fullTankDistance);



//        double miles100Cost = 0.0; // (100 / milesPerGallon) * pricePerGallon
//        double fullTankDistance = 0.0; // tankSize * milesPerGallon

    }
}
