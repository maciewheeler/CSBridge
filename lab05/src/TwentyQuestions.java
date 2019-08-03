import java.util.*;

public class TwentyQuestions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to 20 questions!");
        System.out.println("Animal, mineral, or vegetable? ");
        String answerOne = in.next();
        if (answerOne.equals("animal")) {
            System.out.println("Is the animal a mammal? Yes or no? ");
            String answerTwo = in.next();
            if (answerTwo.equals("yes")) {
                System.out.println("Does it live on land? Yes or no? ");
                String answerThree = in.next();
                if (answerThree.equals("yes")) {
                    System.out.println("Your object is a human.");
                } else {
                    System.out.println("Your object is a dolphin.");
                }
            } else {
                System.out.println("Does it fly? Yes or no? ");
                String answerFour = in.next();
                if (answerFour.equals("yes")) {
                    System.out.println("Your object is an eagle.");
                } else {
                    System.out.println("Your object is a lizard.");
                }
            }
        } else if (answerOne.equals("mineral")) {
            System.out.println("Is it the hardest mineral? Yes or no? ");
            String answerFive = in.next();
            if (answerFive.equals("yes")) {
                System.out.println("Your object is a diamond.");
            } else {
                System.out.println("Your object is lead.");
            }
        } else {
            System.out.println("Is it a fruit? Yes or no? ");
            String answerSix = in.next();
            if (answerSix.equals("yes")) {
                System.out.println("Does it grow on a vine? Yes or no? ");
                String answerSeven = in.next();
                if (answerSeven.equals("yes")) {
                    System.out.println("Your object is a tomato.");
                } else {
                    System.out.println("Your object is a peach.");
                }
            } else {
                System.out.println("Is it a tree? Yes or no? ");
                String answerEight = in.next();
                if (answerEight.equals("yes")) {
                    System.out.println("Your object is a maple tree.");
                } else {
                    System.out.println("Your object is a potato.");
                }
            }

        }
    }
}
