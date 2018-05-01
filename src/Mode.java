import java.io.*;
import java.util.Scanner;

public class Mode extends AdministratorMode {
	AdministratorMode b = new AdministratorMode();
	StudentMode c = new StudentMode();

	public void updateRecord() throws IOException {
		Scanner keyboard = new Scanner(System.in);
		int userChoice = 0;
		boolean quit = false;
		System.out.println("Enter one of the following option:");
		System.out.println("1. Administrator mode.");
		System.out.println("2. Student mode.");
		userChoice = keyboard.nextInt();
		if (userChoice == 1) {
			b.AdminMenu();
		} else if (userChoice == 2) {
			c.StudendMenu();
		}

	}
}
