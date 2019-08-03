import java.util.*;

public class reverseNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to be reversed: ");
        String number = s.next();

        int c = 1;
        char last = number.charAt(number.length() - 1);
        while (last != 0) {
            System.out.print(last);
            c = c + 1;
            last = number.charAt(number.length() - c);
        }
    }
}
