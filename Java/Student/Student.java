public class Student
{
	private byte sc1,
				 sc2,
				 sc3;
				 //declares variables
	private byte tests[];
	public Student(int q)
	{
		tests = new byte[q];
		//constructor that resets all values to 0
	}
	public Student(byte scoreOne, byte scoreTwo, byte scoreThree)
	{
		sc1 = scoreOne;
		sc2 = scoreTwo;
		sc3 = scoreThree;
		// constructor, never used, but able to take input to initialize variables
	}
	public void setScore(byte score, int i)
	{
		tests[i] = score;
	}
	public void setScore1(byte scoreOne)
	{
		sc1 = scoreOne;
		//takes the input passed to it through scoreOne and puts it in sc1
	}
	public void setScore2(byte scoreTwo)
	{
		sc2 = scoreTwo;//does the same for sc2
	}
	public void setScore3(byte scoreThree)
	{
		sc3 = scoreThree;//and sc3
	}
	public byte getScore1()
	{
		return sc1;//returns the value of the 1st score to the demo
	}
	public byte getScore2()
	{
		return sc2;//same for 2nd score
	}
	public byte getScore3()
	{
		return sc3;//and third
	}
	public double getAverage()
	{
		int total = 0;
		for(int i = 0; i < tests.length; i++)
		{
			total += tests[i];
		}
		return (double) total/tests.length;//calculates average and returns it to demo
	}
	public char getLetterGrade()
	{
		char grade;
		
		if(getAverage() < 60)
			grade = 'F';
		else if(getAverage() < 70)
			grade = 'D';
		else if(getAverage() < 80)
			grade = 'C';
		else if(getAverage() < 90)
			grade = 'B';
		else
			grade = 'A';
			
		return grade;
	}
}
