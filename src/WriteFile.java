import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WriteFile {
	File file = new File("tt4.txt");
	private String FName;
	private String LName;
	private String ID;
	PrintWriter output;
	public String getFName() {
		return FName;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	
	public void writeFile() {
		try {
			// ArrayList<Integer> a = new ArrayList<Integer>();
			
			output = new PrintWriter(file);
			Scanner keyboard = new Scanner(System.in);
		//	output.println("FName" + " " + "LName" + " " + "Student ID");

			while (true) {
				System.out.println("Enter the Student ID, name and age:");
				System.out.println("Hit q to exit the program:");
				System.out.println("Enter first name");
				FName = keyboard.next();
				System.out.println("Enter last name");
				LName = keyboard.next();
				System.out.println("Enter student ID");
				ID = keyboard.next();
				List<String> b = new ArrayList<String>();
				b.add(getFName() + " ");
				b.add(getLName() + " ");
				b.add(getID() + " ");
				b.add("\n");
				
				if ((getFName().equals("q")) && (getLName().equals("q")) && (getID().equals("q"))) {
					break;
				} else {

					b = b.stream().distinct().collect(Collectors.toList());
					for (int i=0; i < b.size(); i++) {
						// output.print(b);
						output.print(b.get(i));
						System.out.println(b.get(i));
						
					}

					System.out.println("Data saved");
				}

			}
			output.close();

		} catch (IOException ex) {
			System.out.printf("Error: %s\n", ex);
		}
	}
}




