import java.util.*;
import javax.swing.JOptionPane;

public class Debug3 {
    public static void main(String[] args){
        String firstName = JOptionPane.showInputDialog("Enter your first name: ");
        String lastName = JOptionPane.showInputDialog("Enter your last name: ");

        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
    }
}
