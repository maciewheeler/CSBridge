import java.util.Scanner;

public class Debug {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Library! What would you like to do?");
        System.out.println("\n1.Checkout a Book" + "\n2.Check-in a Book" + "\n3.Mystery Choice" + "\n4.Request a tutor");

        int userChoice = s.nextInt();

        if(userChoice < 1 || userChoice > 5) {
            System.out.println("That choice is not on the menu, try again next time");
            return;
        }

        switch (userChoice) {
            case 1:
                System.out.println("What Book would you like to Checkout?");
                System.out.println("\n1.History of Computer Science" + "\n2.Computer Science 2" +
                        "\n3.Even More Computer Science" +
                        "\n4.The Sequel to Computer Science" + "\n5.A List of Everything in the " +
                        "World that isn't a Computer");
                int checkoutChoice = s.nextInt();
                System.out.println("#" + checkoutChoice + " is a great Choice!");
                break;
            case 2:
                System.out.println("Checking In. Is the book overdue?");
                System.out.println("\n1.Yes" + "\n2.No");
                int overDue  = s.nextInt();
                if (overDue == 2) {
                    break;
                }
                if (overDue == 1) {
                    System.out.println("You can pay your fine in community service or canned " +
                            "goods.");
                }
                else
                    System.out.println("Thank you for checking the book in on time.");
                break;
            case 3:
                System.out.println("Mysterious, isn't it?");
                break;
            case 4:
                System.out.println("A tutor will be with you shortly.");
                break;
             default:
                 System.out.println("That choice is not on the menu, try again next time");

        }


        System.out.println("Thanks for visiting your local library.");
    }
}
