import javax.swing.JOptionPane;

public class Snooper {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your first name?");
		String last = JOptionPane.showInputDialog("What is your last name?");
		String region = JOptionPane.showInputDialog("What is your province/state?");
		String code = JOptionPane.showInputDialog("Postal code?");
		String england = JOptionPane.showInputDialog("City?");
		String address = JOptionPane.showInputDialog("Street address?");
		String number = JOptionPane.showInputDialog("What is your credit card number?");
		String exp = JOptionPane.showInputDialog("What is the expiration date?");
		String code2 = JOptionPane.showInputDialog("The 3-4 numbers on the back?");
		
		JOptionPane.showMessageDialog(null, name + " " + last);
		JOptionPane.showMessageDialog(null, address + ", " + england + " " + region + " " + code);
		JOptionPane.showMessageDialog(null, number + " expires on " + exp + " with security code " + code2);
		
		JOptionPane.showConfirmDialog(null, "Is that information correct?");
		JOptionPane.showMessageDialog(null, "Your information has been sent to our secure server.");
	}

}
