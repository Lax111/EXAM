package praexam;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class tttete {

	public static void main(String[] args) {
		
		String line;
		
		try {
			FileReader reader = new FileReader("example.txt");
			
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
		}

	}

}
