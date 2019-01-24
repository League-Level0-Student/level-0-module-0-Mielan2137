import javax.swing.JOptionPane;

public class EverythingisAwesome {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello Mate");

		String name = JOptionPane.showInputDialog("Name?");
		if (name.equals("Sebas")) {
			JOptionPane.showMessageDialog(null, "Hello " + name);
		}

		
		JOptionPane.showInputDialog("Breakfast?");
		JOptionPane.showMessageDialog(null, "Great");

		JOptionPane.showInputDialog("Dressed?");
		JOptionPane.showMessageDialog(null, "Great");

		JOptionPane.showInputDialog("Breakfast for the next three days?");
		JOptionPane.showMessageDialog(null, "Great");

		JOptionPane.showInputDialog("Suitcase?");
		JOptionPane.showMessageDialog(null, "Great");

		JOptionPane.showInputDialog("Jewlery?");
		JOptionPane.showMessageDialog(null, "Great");

		JOptionPane.showInputDialog("Glasses?");
		JOptionPane.showMessageDialog(null, "Great");

		JOptionPane.showInputDialog("Shoes?");
		JOptionPane.showMessageDialog(null, "Great");

		JOptionPane.showInputDialog("Car ready to go?");
		JOptionPane.showMessageDialog(null, "Great");

		JOptionPane.showInputDialog("How do you feel about today?");
		JOptionPane.showMessageDialog(null, "Wonderful");
		JOptionPane.showMessageDialog(null, "Get to work");

		JOptionPane.showMessageDialog(null, "Don't forget to pick up your dry cleaning");

	}

}
