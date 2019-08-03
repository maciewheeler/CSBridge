import java.util.*;
import java.io.*;

public class ArrayChallenge {

    public static int[] increaseOddValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] + 1;
            }
        }
        return array;
    }

    public static int [] increaseOddIndices(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = array[i] + 1;
            }
        }
        return array;
    }

    public static void main(String args[]) {

        //Main method is empty. Please use to test your code, as needed.

    }
}