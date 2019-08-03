public class MatricesChallenge {

    public static int computeSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        //Main method is empty. Please use to test your code, as needed.
    }
}