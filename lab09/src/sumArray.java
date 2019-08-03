import java.util.*;

public class sumArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array one, must be less than 10");
        int sizeArray1 = in.nextInt();
        System.out.println("Enter the size of array two, must be less than 10");
        int sizeArray2 = in.nextInt();

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < sizeArray1; i++) {
            System.out.println("Enter the value for array1: ");
            array1[i] = in.nextInt();
        }


        for (int j = 9; j > 9 - sizeArray2; j--) {
            System.out.println("Enter the value for array2: ");
            array2[j] = in.nextInt();
        }

        int [] newArray = new int[10];
        int overlap = sizeArray2 - sizeArray1;

        for (int m = 0; m < sizeArray1 - overlap; m++) {
            System.out.println(array1[m]);
        }
        for (int m = sizeArray1 - overlap; m < sizeArray2 - overlap; m++) {
            System.out.println(array1[m] + array2[m]);
        }
        for (int m = sizeArray2 - overlap; m < 10; m++ ) {
            System.out.println(array2[m]);
        }
    }
}
