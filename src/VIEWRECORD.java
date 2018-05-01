import java.io.*;
public class VIEWRECORD 
{

	
	public void VIEW() throws IOException{
	FileReader fr = new FileReader("tt4.txt");
	BufferedReader br = new BufferedReader(fr);
//	BufferedReader br = new BufferedReader(new FileReader("tt4.txt"));
	String line = br.readLine();
	while(line != null){
		System.out.println(line);
		line = br.readLine();
	}
	br.close();
	
}
	
}

