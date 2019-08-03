import java.util.Scanner;

public class TaskOneChallenge {

    public static void main(String[] args) {

        /*
         *
         * The following prompts are provided for you to structure your program.
         * See the Lab Page for specific output guidelines.
         */
        System.out.println("Welcome to the Class Cookie Calculator!");
        System.out.println("Please enter your full name: ");

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        int startIndex = name.indexOf(" ") + 1;
        int stopIndex = name.length();
        String lastName = name.substring(startIndex, stopIndex);

        String greetingName = "Dr. " + lastName;

        System.out.println("Hello " + greetingName + "!");

        System.out.println("Enter the name of the class you want to calculate: ");

        String schoolClass = s.nextLine();

        System.out.println("How many students are in the class? ");

        int studentAmount = s.nextInt();

        System.out.println("How many cookies do you have?");

        int cookieAmount = s.nextInt();




        System.out.println("Finished calculating, " + greetingName + "!");
        System.out.println("Each " + schoolClass + " student will get " + (cookieAmount / studentAmount) + " cookies " +
                "if each student wants a whole cookie, with " + (cookieAmount % studentAmount) + " left over!");

        System.out.printf("Each " + schoolClass + " student will get " + "%.2f" +
                " cookies if students are willing to split cookies!", ((double)cookieAmount / studentAmount));

    }
}
