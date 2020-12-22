package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday?");
		if (birthday.equals("12/21")) {
			JOptionPane.showMessageDialog(null, "happy birthday!");

		} else {
			JOptionPane.showMessageDialog(null, "Well too bad!");

		}
	}
}
