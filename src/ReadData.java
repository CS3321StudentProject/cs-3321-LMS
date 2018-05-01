import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadData {
	private Scanner scanningFile;

	public void OpeningFile() {
		try {
			scanningFile = new Scanner(new File("tt1.txt"));
		} catch (Exception e) {
			System.out.println("Could not read file.");
		}

	}

	public void ReadingFile() {
		OpeningFile();
		ArrayList<String> naruto = new ArrayList<String>();
		while (scanningFile.hasNextLine()) {
			naruto.add(scanningFile.nextLine());
		}
		int tempGrades[];
		ArrayList<int[]> studentGrades = new ArrayList<int[]>();
		for (String tempInfo : naruto) {
			String tempArray[] = tempInfo.split(" ");
			tempGrades = new int[tempArray.length];
			for (int x = 0; x < tempArray.length; x++) {
				int google = Integer.valueOf(tempArray[x]);
				tempGrades[x] = google;
			}
			studentGrades.add(tempGrades);
		}
		for (int[] individualArray : studentGrades) {
			String studentGrade = null;
			studentGrade = letterGrades(individualArray);
			System.out.println(studentGrade);
		}
	}

	public String letterGrades(int[] someArray) {
		String studentLetterGrade = null;

		int totalScore = 0;
		int strikes = 0, counter = 0;
		for (int x = 1; x < someArray.length; x++) {
			if (someArray[x] == -1)
				strikes += 1;
			else {

				counter += 1;
				totalScore += someArray[x];
			}
		}
		if (strikes == 2)
			studentLetterGrade = "i";
		else {
			System.out.println(totalScore);
			totalScore = totalScore / counter;
			System.out.println(totalScore);
			if (totalScore > 89)
				studentLetterGrade = "A";
			else if (totalScore > 79)
				studentLetterGrade = "B";
			else if (totalScore > 69)
				studentLetterGrade = "C";
			else if (totalScore >= 59)
				studentLetterGrade = "D";
			else
				studentLetterGrade = "F";
		}
		return studentLetterGrade;
	}

}
