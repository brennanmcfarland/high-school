//averages 3 scores like TestScores, but using dialogue boxes

import javax.swing.JOptionPane;

public class TestScores2
{
	public static void main(String[] args)
	{ 	
		String inputString;
		int sc1,
			sc2,
			sc3;
		float avg;
		 
		inputString = JOptionPane.showInputDialog("Enter test score 1:");
		sc1 = Integer.parseInt(inputString);
		inputString = JOptionPane.showInputDialog("Enter test score 2:");
		sc2 = Integer.parseInt(inputString);
		inputString = JOptionPane.showInputDialog("Enter test score 3:");
		sc3 = Integer.parseInt(inputString);
		
		avg = (float)(sc1+sc2+sc3)/3;
		
		JOptionPane.showMessageDialog(null, "The average of your test scores is " + avg);
		System.exit(0);
	}
}