public class Array {
    public static void main(String[] args) {
        //dataType[] arrayVariable;
        int[] numbers;
        numbers = new int[10];
        numbers[0] = 1;

        for (int i = 1; i < 10; i++) {
            numbers[i] = i + 1;
        }

        for (int index = 0; index < 10; index++) {
            System.out.println(numbers[index]);
        }
    }
}
