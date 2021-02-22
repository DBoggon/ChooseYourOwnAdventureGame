import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Hero h = new Hero();
		ClassType c = new ClassType();
		Story s = new Story();
		
		System.out.println("Welcome traveler...\n");
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name? \n");
		h.setName(userInput.nextLine());
		
		System.out.println("\nWhat gender do you identity as " + h.getName() + "? \n" + "\n 1. (M)ale \n 2. (F)emale \n 3. Gender (N)eutral \n");
		String userInputGender = userInput.nextLine();
		h.gender(userInputGender);
		
		
		System.out.println("\nAre you more of a stabby fronty, stabby backy or stabby from a distancey kinda player?\n\n 1. I like to get up close and personal! (P)aladin \n 2. Straight up backstabber. I have no shame. (R)ogue \n 3. I'd rather not get too close to my victim. (R)anger\n");
		String userInputClass = userInput.nextLine();
		c.classBuilder(userInputClass);
		s.backStory(userInputClass);
		
		
		
		
		 
		
		
		
	}

	
}
