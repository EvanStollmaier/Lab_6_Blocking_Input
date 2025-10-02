import java.util.Scanner;

public class RectangleInfo
{
    static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;          // length * width
        double perimeter = 0.0;     // 2 * (length + width)
        double hypotenuse = 0.0;    // Math.sqrt(length * length + width * width)
        boolean done = false;

        do
        {
            System.out.println("Enter the length: ");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine();
                if (length <= 0)
                {
                    System.out.println("Length must be greater than zero. Please try again.");
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
            System.out.println("Enter the width: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();
                if (width <= 0)
                {
                    System.out.println("Width must be greater than zero. Please try again.");
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
        done = false; //  Reset for next input

        area = length * width;
        perimeter = 2 * (length + width);
        hypotenuse = Math.sqrt(length * length + width * width); // Pythagorean theorem

        System.out.printf("A rectangle with length %.2f and width %.2f", length, width);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Hypotenuse: %.2f%n", hypotenuse);

    }
}
