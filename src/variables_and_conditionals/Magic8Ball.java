package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random
		// number into this variable using "new Random().nextInt(4)"
		Random randy = new Random();
		int myRandom = randy.nextInt(5);
		// 3. Print out this variable
		System.out.println(myRandom);
		// 4. Get the user to enter a question for the 8 ball
		String Question = JOptionPane.showInputDialog("enter a question");
		// 5. If the random number is 0
		if (myRandom == 0) {
			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "Yes");
		}
		// 6. If the random number is 1
		if (myRandom == 1) {
			JOptionPane.showMessageDialog(null, "no");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (myRandom == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (myRandom == 3) {
			JOptionPane.showMessageDialog(null, "probably not");
			if (myRandom == 4) {
				JOptionPane.showMessageDialog(null, "totally");
			}
			// -- write your own answer

		}
	}
}
