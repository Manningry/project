import java.util.ArrayList;

public class NewDogs
	{
	
	private String nameOfDog;
	private String breed;
	private int age;
	private double weight;
	
	
   public NewDogs(String nod, String b, int a, double w)
	   {
	   nameOfDog = nod;
	   breed = b;
	   age = a;
	   weight = w;
	   }


	public String getNameOfDog()
		{
		return nameOfDog;
		}

	public String getBreed()
		{
		return breed;
		}

	public int getAge()
		{
		return age;
		}

	
	public double getWeight()
		{
		return weight;
		}
	
	public static void main(String[] args)
		{

		ArrayList <NewDogs> myDogs = new ArrayList <NewDogs>();
		
		myDogs.add(new NewDogs("Killa", "Chocolate HoundBull", 4, 122.8));
		myDogs.add(new NewDogs("Zoey", "Green Lab", 2, 88.0));
		myDogs.add(new NewDogs("Spike", "Border Collie", 8, 65.43));
		myDogs.add(new NewDogs("Young Stunna", "Weiner Dog", 6, 11.683));
		myDogs.add(new NewDogs("Bear", "Dark Dalmation", 3, 86.7));
		
		for(NewDogs x : myDogs)
			{
			System.out.println(x.getNameOfDog() + " the " + x.getBreed() + " is " + x.getAge() + " years old and weighs " + x.getWeight() + " pounds!");
			}
		
		double totalWeight = 0;
		int totalAge = 0;
		
		for(NewDogs z : myDogs)
			{
			totalWeight = totalWeight + z.getWeight();
			totalAge = totalAge + z.getAge();
			}
		
		
System.out.println("");
			
System.out.println("The average age of the dogs is " + totalAge/myDogs.size()
+ " and the combined weight of the dogs is " + totalWeight + " pounds.");
			
			
			}
		
		}

	
