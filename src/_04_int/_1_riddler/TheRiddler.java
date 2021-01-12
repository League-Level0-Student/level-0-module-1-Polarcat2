package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("what can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle.equals("a stamp")) {
			JOptionPane.showMessageDialog(null, "correct!");
			
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "wrong, the answer is a stamp.");

		}
		// 6. Add some more riddles
		riddle= JOptionPane.showInputDialog("what has to be broken before you use it?");
		if (riddle.equals("an egg")) {
			JOptionPane.showMessageDialog(null, "correct!"); 
			
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong, the answer is an egg.");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "You scored "+score);
		
	}
}

