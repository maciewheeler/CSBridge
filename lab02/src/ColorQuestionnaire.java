import javax.swing.*;

public class ColorQuestionnaire {

    public static void main(String[] args) {

        String color;

        String greeting;

        color = JOptionPane.showInputDialog("What's your favorite color? ");




        greeting = "Nice! I think " + color + " is a great color too!";

        JOptionPane.showMessageDialog(null, greeting);

    }

}

