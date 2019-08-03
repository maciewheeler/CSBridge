import java.util.Scanner;

/**
 *Comments
 */

public class MathTools {

    public static void main(String[] args) {
        /*Here are prompts and outputs for this lab. Build your program around them. */

        Scanner s = new Scanner(System.in);

        System.out.println("#######################################");
        System.out.println("1 - Absolute Value");
        System.out.println("2 - Power");
        System.out.println("3 - Scientific Notation");
        System.out.println("4 - isPrime");
        System.out.print("Select a number from the menu choices: ");
        int choice = s.nextInt();
        System.out.println("#######################################");


        if (choice == 1) {
            System.out.println("***Absolute Value***");
            System.out.print("Enter the number: ");
            double absValueNumber = s.nextDouble();
            if (absValueNumber >= 0) {
                System.out.println("Result: " + absValueNumber);
            }
            else {
                absValueNumber = absValueNumber * -1;
                System.out.println("Result: " + absValueNumber);
            }
        }

        else if (choice == 2) {
            System.out.println("***Power***");
            System.out.print("Enter the base: ");
            double base = s.nextDouble();
            System.out.print("Enter the exponent: ");
            double exponent = s.nextDouble();
            double powerAnswer = 0;
            if (exponent == 0) {
                powerAnswer = 1;
            }
            else if (exponent < 0) {
                double m = 0;
                for (int i = 0; i >= exponent; i--)
                    m = base * base;
                    powerAnswer = powerAnswer + m;
                powerAnswer = 1 / powerAnswer;
            }
            else if (exponent > 0) {
                double n = 0;
                for(int i = 1; i <= exponent; i++)
                    n = base * base;
                    powerAnswer = powerAnswer + n;
            }
            System.out.println("Result: " + powerAnswer);
        }

        else if (choice == 3) {
            System.out.print("Enter the number: ");
            double number = s.nextDouble();
            if (number < 1) {
                int c = 0;
                while (number < 1) {
                    number = number * 10;
                    c = c + 1;
                }
                System.out.println("Result: " + number + " x 10 ^ " + c);
            }
            else if (number >= 10) {
                int c = 0;
                while (number >= 10) {
                    number = number * .1;
                    c = c + 1;
                }
                System.out.println("Result: " + number + " x 10 ^ " + c);
            }
             else if (number >= 1 || number < 10) {
                number = ((int) (number * 1000000)) / 1000000.0;
                System.out.println("Result: " + number + " x 10 ^ 0");
            }
        }

        else if (choice == 4) {
            System.out.print("Enter the integer: ");
            int integer = s.nextInt();
            if (integer % 2 == 0) {
                System.out.println(integer + " is not Prime");
            }
            else if (integer % integer == 0) {
                System.out.println(integer + " is Prime");
            }
        }

        else {
            System.out.println("Invalid option.");
        }




        System.out.print("Return to the menu? (yes/no): ");
        System.out.println("Exiting MathToolsClient...");
    }
}
