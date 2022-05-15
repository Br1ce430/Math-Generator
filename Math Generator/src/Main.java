import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//The main class houses the main method. 
public class Main {
	//The main method asks the user what skills they would like to practice, calling the corresponding methods.
	public static void main(String[] args) {
		boolean bool = true;
		while(bool == true) {
		ImageIcon math = new ImageIcon(Main.class.getResource("mathacademy.PNG"));
		JOptionPane.showMessageDialog(null, null, null, JOptionPane.INFORMATION_MESSAGE, math);
		int numberQuestions = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount of questions for this session:"));
		int opt1 = JOptionPane.showConfirmDialog(null, "Would you like to practice addition?");
		boolean wantsAddition = false;
		if(opt1 == 0) {
			wantsAddition = true;
		}
		else {
			wantsAddition = false;
		}
		int opt2 = JOptionPane.showConfirmDialog(null, "Would you like to practice subtraction?");
		boolean wantsSubtraction = false;
		if(opt2 == 0) {
			wantsSubtraction = true;
		}
		else {
			wantsSubtraction = false;
		}
		int opt3 = JOptionPane.showConfirmDialog(null, "Would you like to practice multiplication?");
		boolean wantsMultiplication = false;
		if(opt3 == 0) {
			wantsMultiplication= true;
		}
		else {
			wantsMultiplication = false;
		}
		int opt4 = JOptionPane.showConfirmDialog(null, "Would you like to practice division?");
		boolean wantsDivision = false;
		if(opt4 == 0) {
			wantsDivision = true;
		}
		else {
			wantsDivision = false;
		}
		int opt5 = JOptionPane.showConfirmDialog(null, "Would you like to practice squaring?");
		boolean wantsSquared = false;
		if(opt5 == 0) {
			wantsSquared = true;
		}
		else {
			wantsSquared = false;
		}
		int opt6 = JOptionPane.showConfirmDialog(null, "Would you like to practice square roots?");
		boolean wantsSqrt = false;
		if(opt6 == 0) {
			wantsSqrt = true;
		}
		else {
			wantsSqrt = false;
		}
		
		User user = new User(numberQuestions, wantsAddition, wantsSubtraction, wantsMultiplication, wantsDivision, wantsSquared, wantsSqrt);
		
		user.test();
		int play = JOptionPane.showConfirmDialog(null, "Would you like to play again?");
		if(play == 0) {
			bool = true;
		}
		else {
			bool = false;
		}
	}
	}
}
