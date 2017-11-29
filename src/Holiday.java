import javax.swing.JOptionPane;

public class Holiday {
	public static void main(String[] args) {
	String present = JOptionPane.showInputDialog("What do you want for the holidays?");
	JOptionPane.showConfirmDialog(null, "Are you sure you want "+present+" for the holidays?");
	JOptionPane.showMessageDialog(null, "Wait! You're on the naughtly list :OOOOOO u get coal xdd");
	}
}