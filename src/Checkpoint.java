import javax.swing.JOptionPane;

public class Checkpoint {

	public static void main(String[] args) {
		String colour = JOptionPane.showInputDialog("What's your favourite colour?");
		JOptionPane.showMessageDialog(null, "My favourite colour is " + colour + " too!");

	}

}
