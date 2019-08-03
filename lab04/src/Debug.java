import java.util.Scanner;

public class Debug {
    public static void main(String args[]) {
        //*Variable declarations *//
        String word1;
        String word2;
        String word3;
        String word4;
        String word5;
        String name;
        String word22;
        String word33;
        String word44;

        //*Assignments*//
        word1 = "Purdue University";
        word2 = "Pot-boiler";
        word22 = "b";
        word3 = "Newsgroup";
        word33 = "u";
        word4 = "sledgehammers";
        word44 = "h";
        word5 = "Countdowns";

        Scanner s = new Scanner(System.in);
        System.out.println("What's your name? ");

        name = s.nextLine();

        System.out.println("Hello, " + name + "!");

        word2 = word2.substring(5, 10);
        word22 = word22.toUpperCase();
        word3 = word3.substring(8, 9);
        word33 = word33.toUpperCase();
        word4 = word4.substring(7, 12);
        word44 = word44.toUpperCase();
        word5 = word5.substring(5, 9);

        System.out.println("We are " + word1 + ", " + word22 + word2 + " " + word33 + word3 + " " + word44 + word4 + " " + word5);
    }
}