package strings_and_dialogs;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str=	JOptionPane.showInputDialog("Whats your name");

	JOptionPane.showMessageDialog(null, "hey"+ str );
		

	}

}
