import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
//This class stores and assigns variables to the users wants.
public class User {

	int howManyQuestions;
	int questionsCorrect;
	boolean wantsAddition;
	boolean wantsSubtraction;
	boolean wantsMultiplication;
	boolean wantsDivision;
	boolean wantsSquared;
	boolean wantsSqrt;
	//This constructor initializes the variables that represent each problem type and the number of questions selected by the user.
	public User(int howManyQuestions, boolean wantsAddition, boolean wantsSubtraction, boolean wantsMultiplicaation, boolean wantsDivision, boolean wantsSquared, boolean wantsSqrt)
	{
		this.howManyQuestions = howManyQuestions;
		this.wantsAddition = wantsAddition;
		this.wantsSubtraction = wantsSubtraction;
		this.wantsMultiplication = wantsMultiplicaation;
		this.wantsDivision = wantsDivision;
		this.wantsSquared = wantsSquared;
		this.wantsSqrt = wantsSqrt;
	}
	//This method adds the selected problems to an ArrayList, which is what will give the problems to the main method and count the amount of questions correct to get a score.
	public void test()
	{
		Question question = new Question();
		Random rand = new Random();
		ArrayList<String> theList = new ArrayList<String>();
		if(wantsAddition)
			theList.add("a");
		if(wantsSubtraction)
			theList.add("s");
		if(wantsMultiplication)
			theList.add("m");
		if(wantsDivision)
			theList.add("d");
		if(wantsSquared)
			theList.add("e");
		if(wantsSqrt)
			theList.add("f");
		for(int i = 1; i <= howManyQuestions; i++)
		{
			int option = rand.nextInt(theList.size());
			Object toAsk = theList.get(option);
			if(toAsk.equals("a"))
			{
				boolean answer = question.solveAdditionQuestion(howManyQuestions, i, questionsCorrect);
				if(answer)
					questionsCorrect++;
			}
			else if(toAsk.equals("s"))
			{
				boolean answer = question.solveSubstractionQuestion(howManyQuestions, i, questionsCorrect);
				if(answer)
					questionsCorrect++;
			}
			else if(toAsk.equals("m"))
			{
				boolean answer = question.solveMultiplicationQuestion(howManyQuestions, i, questionsCorrect);
				if(answer)
					questionsCorrect++;
			}
			else if(toAsk.equals("d"))
			{
				boolean answer = question.solveDivisionQuestion(howManyQuestions, i, questionsCorrect);
				if(answer)
				questionsCorrect++;
			}
			else if(toAsk.equals("e"))
			{
				boolean answer = question.solveSquared(howManyQuestions, i, questionsCorrect);
				if(answer)
				questionsCorrect++;
			}
			else if(toAsk.equals("f"))
			{
				boolean answer = question.solveSqrt(howManyQuestions, i, questionsCorrect);
				if(answer)
				questionsCorrect++;
			}
		}
		JOptionPane.showMessageDialog(null, "You got " + questionsCorrect + " out of " + howManyQuestions+ " questions correct, which is " + (double)questionsCorrect/howManyQuestions*100 + "%.");
		if((double)questionsCorrect/howManyQuestions*100 >= 70) {
			JOptionPane.showMessageDialog(null, "Since you scored 70% or better, you win a limited edition NFT!");
			JOptionPane.showMessageDialog(null, "Drumroll please!");
			ImageIcon rico = new ImageIcon(User.class.getResource("rico outline.PNG"));
			JOptionPane.showMessageDialog(null, "Wow! you got the Rico, an NFT valued at $69 million.", "Prize", JOptionPane.INFORMATION_MESSAGE, rico);
		}if((double)questionsCorrect/howManyQuestions*100 < 70) {
				JOptionPane.showMessageDialog(null, "Dont worry, keep playing to improve your skills.");
			}
		
		
	}
	
}
