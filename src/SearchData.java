import java.io.*;
import java.util.Scanner;
public class SearchData{
private Scanner keyboard;
private BufferedReader br1;

public void search() throws IOException{
	br1 = new BufferedReader(new FileReader("tt4.txt"));	
	 String line = br1.readLine();
	
	 keyboard = new Scanner(System.in);
	 while(line != null){
		 System.out.println("Enter the name to perform search");
		 String n = keyboard.nextLine();
		 if(line.contains(n)){
			 System.out.println("found.");
		 		System.out.println(line);
		 }
		 
		 line = br1.readLine(); 
		
//		 else{
//			 System.out.println("not found.");
//		 }
		
	 }
	
	 
	}

}