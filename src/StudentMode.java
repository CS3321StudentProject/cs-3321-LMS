import java.io.IOException;
import java.util.*;

public class StudentMode extends WriteFile  {
	WriteFile a = new WriteFile();
//	RegisterClasses b = new RegisterClasses();
	public void StudendMenu() throws IOException {
		Scanner keyboard = new Scanner(System.in);
		int userChoice = 0;
		boolean quit = false;
		do {
			System.out.println("1. Register for the class.");
			System.out.println("2. View the course grade.");
			System.out.println("3. View the semester gpa.");
			System.out.println("Your choice, 0 to quit: ");
			userChoice = keyboard.nextInt();

			switch (userChoice) {
			case 1:
//				b.Register();
				break;
			case 2:
				// This will delete the student record
				break;

			case 3:
				// This will search the student record
				break;
			default:
				System.out.println("Thank you!!!. Exiting the program.");
				System.exit(0);
			}
			System.out.println();
		} while (!quit);
		System.out.println("Bye");
	}

}
