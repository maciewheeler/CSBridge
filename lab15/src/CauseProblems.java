public class CauseProblems {
    public static void main(String[] args) {
        try {
            int [] values = {1, 2, 3};
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values [i]);
            }
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
            System.out.println("Stack Trace: ");
            e.printStackTrace();
        }
    }
}
