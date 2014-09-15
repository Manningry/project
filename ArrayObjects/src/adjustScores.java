import java.util.ArrayList;
import java.util.Scanner;


public class adjustScores
	{
	static ArrayList <Student> results = new ArrayList <Student>();
	
	public static void main(String[] args)
		{
	
		
		results.add(new Student("Ryan", 99));
		results.add(new Student("Jimbo", 85));
		results.add(new Student("George", 48));
		results.add(new Student("Lacy", 100));
		results.add(new Student("Britanny", 32));
		
		displayScores();
		addStudent();
		displayScores();
		adjustScores();
		displayScores();
		}
	
	public static void displayScores()
		{
		for(Student x : results)
			{
			System.out.println("Name: " + x.getName() + " \tScore: " + x.getScore());
			}
		}
	
	public static void addStudent()
		{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the name of a new student.");
		System.out.println("Please enter the score of that student.");
		
		String newName = userInput.nextLine();
		int newScore = userInput.nextInt();
		results.add(new Student(newName, newScore));
		
		}

	public static void adjustScores()
		{
		for(int i = 0; i <results.size(); i++)
			{
			if(results.get(i).getScore() < 50)
				{
				results.get(i).setScore(55);
				}
			}
		}
	
	}
