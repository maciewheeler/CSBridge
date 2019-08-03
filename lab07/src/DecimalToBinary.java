import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number to be changed into binary");
        int number = s.nextInt();

        int c = number;
        String b = "";
        int n;
        String m;

        while (c != 0) {
            n = number % 2;
            if (n == 1) {
                m = "1";
            }
            else {
                m = "0";
            }
            b = m + b;
            number = number / 2;
            c = c / 2;
        }
        System.out.print(b);



    }
}
