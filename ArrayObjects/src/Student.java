import java.util.ArrayList;
import java.util.Scanner;


public class Student
	{
	
	private String name;
	private int score;
	static ArrayList <Student> results = new ArrayList <Student>();
	
public Student(String n, int s)
	{
	name = n;
	score = s;
	}

public String getName()
	{
	return name;
	}

public int getScore()
	{
    return score;
	}

public void setName()
	{
	this.name=name;
	}

public void setScore(int score)
	{
	this.score= score;
	}

	
	
	}
