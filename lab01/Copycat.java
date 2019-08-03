import javax.swing.*;
/**
* Bridge - Lab 01
*
* Displays the Hello World message
*
* @author Macie, wheele73@purdue.edu, HAAS G040
*
* @version 08/29/19
*
*/
public class Copycat {
	public static void main(String[] args){
		String s = JOptionPane.showInputDialog("Trigger the copycat:");
		JOptionPane.showMessageDialog(null, s);
	}
}
