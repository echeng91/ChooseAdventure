import java.util.Scanner;

public class ChooseYourOwnAdventureGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice1, choice2, choice3, choice4;
		System.out.println("In front of you are two paths, one with thorns, the other clear. You must choose one.");
		System.out.println("1. Thorny path");
		System.out.println("2. Clear path");
		choice1 = choiceValidator(keyboard, 2);
		if(choice1 == 1)
		{
			System.out.println("The thorns prick and annoy you, but cause no damage. You see a house. What will you do?");
			System.out.println("1. Go inside the house");
			System.out.println("2. Go around the house");
			choice2 = choiceValidator(keyboard, 2);
			if(choice2 == 1)
			{
				System.out.println("Inside the house you see a staircase. What will you do?");
				System.out.println("1. Ascend the staircase");
				System.out.println("2. Explore the ground floor");
				System.out.println("3. Exit the house");
				choice3 = choiceValidator(keyboard, 3);
				if(choice3 == 1)
				{
					System.out.println("At the top of the staircase is a door. It is locked.");
				}
				else if(choice3 == 2)
				{
					System.out.println("You find a key.");
				}
				else
				{
					System.out.println("You see a house. What will you do?");
					System.out.println("1. Go inside the house");
					System.out.println("2. Go around the house");
					choice4 = choiceValidator(keyboard, 2);
					if(choice4 == 1)
					{
						System.out.println("Inside the house you see a staircase.");
					}
					else
					{
						System.out.println("You encounter a suspicious man wearing an overcoat.");
					}
				}
			}
			else
			{
				System.out.println("You encounter a suspicious man wearing an overcoat. What will you do?");
				System.out.println("1. Ignore him");
				System.out.println("2. Talk to him");
				choice3 = choiceValidator(keyboard, 2);
				if(choice3 == 1)
				{
					System.out.println("The man looks disappointed.");
				}
				else
				{
					System.out.println("The man says \"What\'re ya buyin\'?\"");
				}
			}
		} 
		else
		{
			System.out.println("The path was not truly clear. You step on something and hear a click. What will you do?");
			System.out.println("1. Duck down");
			System.out.println("2. Ignore it");
			choice2 = choiceValidator(keyboard, 2);
			if(choice2 == 1)
			{
				System.out.println("You feel something fly over your head. Continuing on, you see a bridge. What will you do?");
				System.out.println("1. Cross the bridge");
				System.out.println("2. Go under the bridge");
				choice3 = choiceValidator(keyboard, 2);
				if(choice3 == 1)
				{
					System.out.println("You find a town. ");
				}
				else
				{
					System.out.println("You encounter a party of trolls.");
				}
			}
			else
			{
				System.out.println("A pillow flies at your head. What will you do?");
				System.out.println("1. Catch it with your arms");
				System.out.println("2. Catch it with your face");
				choice3 = choiceValidator(keyboard, 2);
				if(choice3 == 1)
				{
					System.out.println("You fail to catch the pillow but successfully dodge it.");
				}
				else
				{
					System.out.println("You hear the words \"BOOM HEADSHOT\" and are knocked down.");
				}
			}
		}
		keyboard.close();
		System.out.println("Game Over.");
	}

	/*
	 * Gets user input for choice and checks to see if it is valid.
	 * Valid choices are 1 - max inclusive.
	 */
	public static int choiceValidator(Scanner sc, int max) {
		int choice = 0; //initialize to invalid value
		System.out.print("What is your choice? ");
		while(choice < 1 || choice > max) {
			choice = sc.nextInt();
			if(choice < 1 || choice > max) {
				System.out.printf("That is not an option. Your options are 1 - %d. Choose. ", max);
			}
		}
		return choice;
	}

}
