import javax.swing.*;

public class PersonalizedGreeting {

    public static void main(String[] args) {

        String firstName;

        String lastName;

        String greeting;

        firstName = JOptionPane.showInputDialog("Please enter your first name: ");

        lastName = JOptionPane.showInputDialog("Please enter your last name: ");



        greeting = "Hello, " + firstName + " " + lastName + "!";

        JOptionPane.showMessageDialog(null, greeting);

    }

}