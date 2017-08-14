package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
 String nickels =JOptionPane.showInputDialog("how many nickels do you have?");
        // Convert their answer to an int using Integer.parseInt()
int numNickels=Integer.parseInt(nickels);
        // Ask the user how many dimes they have, and convert their answer
String dimes =JOptionPane.showInputDialog("how many dimes do you have?");
int numdimes=Integer.parseInt(dimes);
        // Ask the user how many quarters they have, and convert their answer
String Quarters =JOptionPane.showInputDialog("how many quarters do you have?");
int numQuarters=Integer.parseInt(Quarters);
        // Calculate how much money the user has and save it in a double variable 
double totalMoney=0;
totalMoney+=(.25*numQuarters);
totalMoney+=(.10*numdimes);
totalMoney+=(.05*numNickels);
        // Tell the user how much money they have
JOptionPane.showMessageDialog(null, totalMoney);
    }
}