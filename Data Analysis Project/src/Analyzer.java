import java.util.ArrayList;




public class Analyzer
	{

	

 public static void main(String[] args)
		{
		Data.addData();
		findRecords();
		findThreeQs();
		startGs();
		lengthSix();
		}
 
 
 
 public static void findRecords()
	 {
    
	System.out.println("There are " + Data.data.size() + " records in the database." );
	System.out.println("");
	
	
	
	}
 

 
public static void findThreeQs()
{

int threeQ = 0;

	for(int i = 0; i < Data.data.size(); i++)
		{
		if(Data.data.get(i).getLetterCode().contains("qqq"))
					{
					threeQ = threeQ + 1;
					}
		}
	System.out.println("There are " + threeQ + " occurences of \"qqq\" in the data.");
	System.out.println("");
		
}	
		

public static void startGs()
	{
	
double countG = 0;
int amount = Data.data.size();

for(int i = 0; i < Data.data.size(); i++)
	{
	if(Data.data.get(i).getLetterCode().substring(0,1).equals("g"))
		{
	    countG = countG + 1;
		}
	}
System.out.println("There are " + countG + " records beginning with the letter \"g\".");
System.out.println("");
System.out.println("That is " + ((countG/(amount))*100) + "% of the records.");

	}


public static void lengthSix()
	{
	
int amount2 = 0;	
	for(int i = 0; i <Data.data.size(); i++)
		{
		if(Data.data.get(i).getLetterCode().length() == (6))
					{
					amount2 = amount2 + 1;
					}
		}
System.out.println("");
System.out.println("There are " + amount2 + " lettercodes of length six.");		
	
	}


}
	
