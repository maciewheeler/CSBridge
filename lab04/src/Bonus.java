import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        int firstNum;
        int secondNum;

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to your calculator! ");
        System.out.print("What is the first number? ");

        firstNum = s.nextInt();

        System.out.print("What is the second number? ");

        secondNum = s.nextInt();

        System.out.println("The result of the addition operation is " + (firstNum + secondNum) + "!");
        System.out.println("The result of the subtraction operation is " + (firstNum - secondNum) + "!");
        System.out.println("The result of the multiplication operation is " + (firstNum * secondNum) + "!");
        System.out.println("The result of the division operation is " + ((double)firstNum/secondNum) + "!");
        System.out.println("The result of the modulus operation is " + (firstNum % secondNum) + "!");
        System.out.println("\n" + "Thank you for using the calculator!");


    }
}
