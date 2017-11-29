import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String bday = JOptionPane.showInputDialog("When is your birthday? mm/dd");
		if(bday.equals("11/29")) {
			JOptionPane.showMessageDialog(null, "merry birthday");
		} 
		else {
			JOptionPane.showMessageDialog(null, "HEE HOO HAH MERRY UN BIRTHDAY XDDDD");
		}
	}

}
