import java.util.Scanner;


public class TextAdventure {

	static int choice1; 
	static int choice2;
	static int choice3;
	static int choice4;
	
	public static void main(String[] args)
	
	{
	Scanner adventure = new Scanner (System.in);
	
	System.out.println("Welcome! You find yourself strapped to the seat of an out-of-control airplane flying at 34,000 feet, but your hands are left free. You have a pair of "
			+ "scissors laying to your left, and a blow torch to the right. Which do you grab? 1) scissors 2) blow torch");
	choice1=adventure.nextInt();
	
	
	if (choice1 == 1)
	{
		System.out.println("Congratulations, you have cut yourself free and are able to move around the airplane! "
				+ "There is an open hatch at the back of plane, or an open door at the front. Where do you go? 1) back of plane 2) front of plane");
		
		choice2=adventure.nextInt();
		
		if(choice2 == 1)
		{
		System.out.println("You walk to the back of the plane and have a choice between a pink parachute and a blue one. Which one do you choose? 1) pink 2) blue");
			
		choice4=adventure.nextInt();
		
			if(choice4 == 1)
			{
			System.out.println("Yay! The pink parachute is perfectly suitable for your weight, and you land safely on the ground. Have a nice life!");
			}
			
			if(choice4 == 2)
			{
			System.out.println("Oops, the blue parachute is rated for a small child. Your weight is too much, and you tear a whole in the parachute. Have a nice time in heaven!:)");
			}
		}
		
		if(choice2 == 2)
		{
		System.out.println("You walk to the front of the plane, and suddenly turbulence knocks you off your feet. Struggling to stand, you lose your balance and "
				+ "fall out of the open door. Good luck in Heaven!:)");
		}
	}
	
	
	if (choice1 == 2)
	{
		System.out.println("Oops, using the blow torch you have accidentally severely burned your stomach, but you are alive and free none the less."
				+ "Ahead of you is an open door with two boxes laying next to it. Do you pick up box one and jump, or box two and jump? 1) box one 2) box two");
		
		choice3=adventure.nextInt();
		
		if(choice3 == 1)
		{
		System.out.println("Congratulations, box one has a professional grade parachute in it! You jump out and float down to the ground, and land in your grandma's front yard! Enjoy some cookies!");
		}
		
		if(choice3== 2)
		{
		System.out.println("Uh-oh, box two is full of venemous rattlesnakes. You get bit three times in the stomach, and lose consciousness. As you wake up and look out the window, the plane crashes into"
				+ " the nearby mountain. Good luck in Heaven!:) ");	
		}
	}
	
	
	}

}
