import javax.swing.*;

public class Debug2 {
    public static void main(String[] args){
        int days = 3;
        int weeks = 4;
        int month = 10;
        double average;

        average = (days + weeks + month) / 5.0;
        JOptionPane.showMessageDialog(null, "The average is: "+ average);
    }
}
