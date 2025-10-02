import java.util.Scanner;

public class CtoFConverter
{
    static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;    // (celsius * 9/5) + 32;
        boolean done = false;
        String trash = "";
        do
        {

            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
                fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
                System.out.printf("%.1f degrees Celsius is %.1f degrees Fahrenheit.%n", celsius, fahrenheit);
            } else {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + ". Please enter a valid number.");
            }
        }while(!done);
    }
}
