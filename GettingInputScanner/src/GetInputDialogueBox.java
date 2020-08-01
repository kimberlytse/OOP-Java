
import javax.swing.JOptionPane;

public class GetInputDialogueBox {
	public static void main(String[] args) {
		
		String className = JOptionPane.showInputDialog("Enter the name of the class: ");
		
		String input = JOptionPane.showInputDialog("Enter the number of students in the class: ");
		
		int noStudents = Integer.parseInt(input); //parsing a string into an integer.
		
		JOptionPane.showMessageDialog(null, "Class name is " + className + ", and has" + noStudents + " students in the class.");
		
		System.exit(0);
	}
}
