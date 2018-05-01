import java.io.FileNotFoundException;
import java.io.IOException;

public class LMS {

	public static void main(String[] args) throws IOException {

		WriteFile obj = new WriteFile();
		Mode obj2 = new Mode();
		SearchData sd = new SearchData();
		VIEWRECORD vr = new VIEWRECORD();
//		RegisterClasses rc = new RegisterClasses();
		obj2.updateRecord();
		vr.VIEW();
		obj.writeFile();
		sd.search();
//		rc.Register();
	}
}
