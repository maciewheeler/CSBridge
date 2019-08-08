import java.util.Scanner;
import javax.swing.*;

/**
 * The MathToolsSol class has several methods that perform specific mathematical
 * operations including absolute value, exponentiation, finding the nth root,
 * , converting a number to scientific notation, and checking if a number is prime.
 *
 * @author Xiaotian Yu, yu599@purdue.edu
 * Modified by: Enoch Adu, eadu
 *
 */
public class MathTools {
    /**
     * Constant specifying the minimum precision needed for nthRoot method.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int choice = 0;
        int cont;

        do {
            Object [] options = {"1 - Absolute Value", "2 - Power", "3 - Scientific Notation", "4 - isPrime"};

            choice = JOptionPane.showOptionDialog(null, "Select a number from the menu choices", "Math Tools", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the number", "Absolute Value", JOptionPane.QUESTION_MESSAGE));
                double res = num < 0 ? num * -1 : num;

                JOptionPane.showMessageDialog(null, "Result: " + res, "Absolute Value", JOptionPane.INFORMATION_MESSAGE);

            } else if (choice == 1) {
                double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the base", "Power", JOptionPane.QUESTION_MESSAGE));
                int exp = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the exponent", "Power", JOptionPane.QUESTION_MESSAGE));

                double res = base;

                if (exp == 0) {
                    res = 1;
                }
                else {
                    double absoluteValue = exp < 0 ? exp * -1 : exp;
                    for (int i = 1; i < absoluteValue; i++) {
                        res *= base;
                    }
                }
                res = exp < 0 ? 1 / res : res;
                JOptionPane.showMessageDialog(null, "Result: " + res, "Power", JOptionPane.INFORMATION_MESSAGE);

            } else if (choice == 2) {
                double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the number", "Scientific Notation", JOptionPane.QUESTION_MESSAGE));
                int exponent = 0;
                double absoluteValue = num < 0 ? num * -1 : num;

                // If n is less than 1, keep shifting the decimal right, decrementing
                // the exponent. If n is greater than or equal to 10, keep shifting the
                // decimal left and incrementing the exponent.
                if (absoluteValue < 1) {
                    while (absoluteValue < 1) {
                        num = num * 10;
                        exponent -= 1;
                        absoluteValue = num < 0 ? num * -1 : num;
                    }
                } else if (absoluteValue >= 10) {
                    while (absoluteValue >= 10) {
                        num = num / 10;
                        exponent += 1;
                        absoluteValue = num < 0 ? num * -1 : num;
                    }
                }

                // Truncate to 6 decimal place precision
                num = ((int)(num * 1000000)) / 1000000.0;
                JOptionPane.showMessageDialog(null, "Result: " + num + " x 10 ^ " + exponent, "Scientific Notation", JOptionPane.INFORMATION_MESSAGE);

            } else if (choice == 3) {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the integer", "isPrime", JOptionPane.QUESTION_MESSAGE));
                boolean isPrime = true;

                // Check if n is a multiple of 2 and n is less than 2
                if (num % 2 == 0 || num < 2)
                    isPrime = false;
                    // Otherwise, check only odd number
                else {
                    for (int i = 3; i * i <= num; i += 2) {
                        if (num % i == 0)
                            isPrime = false;
                    }
                }

                if (num == 2) {
                    isPrime = true;
                }

                if (isPrime)
                    JOptionPane.showMessageDialog(null, num + " is Prime", "isPrime", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, num + " is not Prime", "isPrime", JOptionPane.INFORMATION_MESSAGE);

            }

            cont = JOptionPane.showConfirmDialog(null, "Return to the menu?", "Math Tools", JOptionPane.YES_NO_OPTION);
        } while (cont == JOptionPane.YES_OPTION);


        if (cont == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Exiting MathToolsClient...", "Math Tools", JOptionPane.INFORMATION_MESSAGE);
        }
        s.close();
    }
}