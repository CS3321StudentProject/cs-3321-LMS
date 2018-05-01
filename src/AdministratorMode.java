import java.io.IOException;
import java.util.*;

public class AdministratorMode extends WriteFile  {
	WriteFile a = new WriteFile();
	SearchData b = new SearchData();
	VIEWRECORD c = new VIEWRECORD();
	SearchData d = new SearchData();
//	StudentMode s = new StudentMode();
	public void AdminMenu() throws IOException {
		Scanner keyboard = new Scanner(System.in);
		int userChoice = 0;
		boolean quit = false;

		do {
			System.out.println("1. Add new student record.");
			System.out.println("2. Delete student record.");
			System.out.println("3. Search for student record.");
			System.out.println("4. Enter Grade for the semester.");
			System.out.println("5. view the student record.");
			System.out.println("Your choice, 0 to quit: ");
			userChoice = keyboard.nextInt();

			switch (userChoice) {
			case 1:
				a.writeFile();
				break;
			case 2:
				// This will delete the student record
				break;

			case 3:
				d.search();
				break;
			case 4:
				// Administrator will enter grade here
				break;
			case 5:
				c.VIEW();
				break;
			default:
//				s.StudendMenu();
				System.exit(0);
				System.out.println("Thank you!!!. Exiting the program.");
				
			}
			System.out.println();
		} while (!quit);
		System.out.println("Bye");
	}
}
	