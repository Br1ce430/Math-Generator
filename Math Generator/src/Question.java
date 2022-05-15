import java.util.Random;
import javax.swing.JOptionPane;
//This class houses all the m,ethods that crate and find the answer to each question (each generated value never exceeds 100 and there are no decimal/fractional answers).
public class Question {

	public int x;
	public int y;
	//This constructor does not initailize any variables, since they are initialized in the methods.
	public Question(){}
	//This method creates and stores the question and answer to a random addition problem.
	public boolean solveAdditionQuestion(int totalQuestions, int questionNumber, int correctQuestion)
	{
		Random rand = new Random();
		x = rand.nextInt(51);
		y = rand.nextInt(51);
		int ans = x + y;
		int answer = Integer.parseInt(JOptionPane.showInputDialog(null,"You are on question " + questionNumber + " out of " + totalQuestions + "\n" + "What is " + x + "+" + y + "?"));
		if (answer == x + y)
		{
			JOptionPane.showMessageDialog(null, "Good Job!");
			return true;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!\nThe correct answer was: " + ans);
			return false;
		}
	}
	//This method creates and stores the question and answer to a random subtraction problem.
	public boolean solveSubstractionQuestion(int totalQuestions, int questionNumber, int correctQuestion)
	{
		Random rand = new Random();
		x = rand.nextInt(100)+1;
		y = rand.nextInt(x);
			int ans = x - y;
			int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "You are on question " + questionNumber + " out of " + totalQuestions + "\n" + "What is " + x + "-" + y + "?"));
			if (answer == x - y)
			{
				JOptionPane.showMessageDialog(null, "Good Job!");
				return true;
			}
		JOptionPane.showMessageDialog(null, "Incorrect!\nThe correct answer was: " + ans);
		return false;
	}
	//This method creates and stores the question and answer to a random multiplication problem.
	public boolean solveMultiplicationQuestion(int totalQuestions, int questionNumber, int correctQuestion)
	{
		Random rand = new Random();
		boolean run = true;
		while(run)
		{
			x = rand.nextInt(51);
			y = rand.nextInt(51);
			if(x*y <= 100)
				run = false;
		}
		int ans = x*y;
		int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "You are on question " + questionNumber + " out of " + totalQuestions + "\n" + "What is " + x + "*" + y + "?"));
		if (answer == x*y)
		{
			JOptionPane.showMessageDialog(null, "Good Job!");
			return true;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!\nThe correct answer was: " + ans);
			return false;
		}
	}
	//This method creates and stores the question and answer to a random division problem.
	public boolean solveDivisionQuestion(int totalQuestions, int questionNumber, int correctQuestion)
	{
		Random rand = new Random();
		boolean run = true;
		while(run)
		{
			x = rand.nextInt(101);
			y = rand.nextInt(101);
			if(x%y == 0 && x != 0 && y != 0)
				run = false;
		}
		
		int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "You are on question " + questionNumber + " out of " + totalQuestions + "\n" + "What is " + x + "/" + y + "?"));
		int ans = x/y;
		if (answer == x/y)
		{
			JOptionPane.showMessageDialog(null, "Good Job!");
			return true;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!\nThe correct answer was: " + ans);
			return false;
		}
	}
	//This method creates and stores the question and answer to a random squared problem.
	public boolean solveSquared(int totalQuestions, int questionNumber, int correctQuestion) {
		Random rand = new Random();
		boolean run = true;
		while(run)
		{
			x = rand.nextInt(51);
			if(x*x <= 100)
				run = false;
		}
		int ans = x*x;
		int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "You are on question " + questionNumber + " out of " + totalQuestions + "\n" + "What is " + x + "^2?"));
		if (answer == x*x)
		{
			JOptionPane.showMessageDialog(null, "Good Job!");
			return true;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!\nThe correct answer was: " + ans);
			return false;
		}
	}
	//This method creates and stores the question and answer to a random square root problem.
	public boolean solveSqrt(int totalQuestions, int questionNumber, int correctQuestion) 
	{
		Random rand = new Random();
		boolean run = true;
		while(run)
		{
			x = rand.nextInt(101);
			if(x == 1) {
				run = false;
			}else if(x == 4) {
				run = false;
			}else if(x == 9) {
				run = false;
			}else if(x == 16) {
				run = false;
			}else if(x == 25) {
				run = false;
			}else if(x == 36) {
				run = false;
			}else if(x == 49) {
				run = false;
			}else if(x == 64) {
				run = false;
			}else if(x == 81) {
				run = false;
			}else if(x == 100) {
				run = false;
			}
			else {
				run = true;
			}
		}
		int ans = (int) Math.sqrt(x);
		int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "You are on question " + questionNumber + " out of " + totalQuestions + "\n" + "What is √" + x + "?"));
		if (answer == Math.sqrt(x))
		{
			JOptionPane.showMessageDialog(null, "Good Job!");
			return true;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!\nThe correct answer was: " + ans);
			return false;
		}
		
	}

}