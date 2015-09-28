//Brennan McFarland
// averages 3 test scores
import java.util.Scanner;

public class TestScores
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int sc1,
			sc2,
			sc3;
		float avg;
		
		System.out.println("Enter test score 1");
		sc1 = keyboard.nextInt();
		System.out.println("Enter test score 2");
		sc2 = keyboard.nextInt();
		System.out.println("Enter test score 3");
		sc3 = keyboard.nextInt();
		
		avg = (float)(sc1+sc2+sc3)/3;
		
		System.out.println("Your average score is" + avg);
	}
}
/*
Enter test score 1
8
Enter test score 2
3
Enter test score 3
7
Your average score is6.0
Computer-Classroom-09:Java 2015538$ java TestScores
Enter test score 1
5
Enter test score 2
6
Enter test score 3
2
Your average score is4.3333335
*/