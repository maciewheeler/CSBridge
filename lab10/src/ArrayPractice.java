public class ArrayPractice {
    public static void main(String[] args) {
        double [] data = {18.3, 61.1, 80.9, 87.9, 43.0, 36.2, 8.6};
        double average = 0.0;
        for (int i = 0; i < 7; i++) {
            average = data[i] + average;
        }
        System.out.printf("Average = %f\n" , average);
    }
}
