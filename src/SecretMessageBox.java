import javax.swing.JOptionPane;
import java.util.Random;

public class SecretMessageBox {

	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("What's your secret message?");
		Random rand = new Random();
		int  pass = rand.nextInt(3) + 1;
		JOptionPane.showMessageDialog(null, "Okay, your message is saved!");
		String input = JOptionPane.showInputDialog("What is the password? 1, 2, or 3.");
		int input2=Integer.parseInt(input);
		if(input2==pass) {
			JOptionPane.showMessageDialog(null, "The message is: "+message+".");
		}
		else {
			JOptionPane.showMessageDialog(null, ":OOOO WRONG PASSWORD!!!!!");
		}
	}

}
