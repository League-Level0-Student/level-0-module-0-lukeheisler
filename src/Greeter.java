import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Windows 10 has crashed. Error 404");
		
		String socialSecurityNo = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showInputDialog(null, "こんにちは " + socialSecurityNo + "!　お元気ですか？");
	}
}
