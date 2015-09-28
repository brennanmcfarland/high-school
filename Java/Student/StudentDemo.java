import java.util.Scanner;

public class StudentDemo
{
	public static void main(String[] args)
	{
		byte response; //holds the user's response
		int numS,
			numQs;
		Scanner keyboard = new Scanner(System.in); //reads keyboard input
		
		System.out.println("How many students?");
		numS = keyboard.nextInt();
		System.out.println("How many tests per students?");
		numQs = keyboard.nextInt();
		Student[] scores = new Student[numS];
		for(int i = 0; i < numS; i++)
		{
			scores[i] = new Student(numQs);
			for(int j = 0; j < numQs; j++)
			{

				System.out.print("Enter test score " + (j+1) + " for student" + (i+1)); //asks for score
				response = keyboard.nextByte();//takes the input
				scores[i].setScore(response, j);
			}
		}
		for(int i = 0; i < numS; i++)
		{
			System.out.println("Average Score for student " + (i+1) + ": " + scores[i].getAverage());
			//displays letter grade
			System.out.println("Letter Grade for student " + (i+1) + ": " + scores[i].getLetterGrade());
		}
	}
}
/*
How many students?
2
How many tests per students?
2
Enter test score 1 for student198
Enter test score 2 for student189
Enter test score 1 for student298
Enter test score 2 for student298
Average Score for student 1: 93.5
Letter Grade for student 1: A
Average Score for student 2: 98.0
Letter Grade for student 2: A
*/