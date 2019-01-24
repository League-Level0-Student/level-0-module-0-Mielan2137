import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Name?");
		JOptionPane.showMessageDialog(null, "Hello " + name);
	}
}
