
public class arrayPractice
	{

	public static void main(String[] args)
		{
		
		String [] classNames = {"jimmy", "frank", "brian", "steve", "john"};
		
			{
			System.out.println(classNames[3]);
			}
		
			
		int total = 0;	
		
		int [] randomNumbers = {1,808,99,4444,70707};
		
			{
			System.out.println(randomNumbers[randomNumbers.length-1]);

			
			for(int i=0; i<randomNumbers.length; i++)
				
				System.out.println(randomNumbers[i]);
			
			for(int i=0; i<randomNumbers.length; i++)
				
				total = total +randomNumbers[i];
			
			System.out.println("The Average is " + (total/(randomNumbers.length)));
			
			}
			
			

		}
	}

	
