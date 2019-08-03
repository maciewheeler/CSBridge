import java.util.*;
import java.io.*;

public class MatricesPractice {

    public static void main(String args[]) {

        int numberOfRows = 0;
        int numberOfColumns = 0;

        int[][] myMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        numberOfRows = myMatrix.length;
        System.out.println(numberOfRows);

        numberOfColumns = myMatrix[0].length;
        System.out.println("\n" + numberOfColumns);

        System.out.println("\n" + myMatrix[0][0] + "\n");

        for (int i = 0; i < myMatrix.length; i++) {
            for (int m = 0; m < myMatrix[0].length; m++) {
                System.out.println(myMatrix[i][m]);
            }
        }

        //TODO: Print the number of rows

        //TODO: Print the number of columns

        //TODO: Print the element at row 1, column 1

        //TODO: Print all of the elements of the matrix

    }
}