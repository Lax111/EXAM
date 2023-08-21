package praexam;

public class abstract1 {

	public static void main(String[] args) {
		
	}
}
abstract class USABankZ{
	
	abstract void loan();
	
	abstract void save();
	

public void displayCountry() {
}
}

class ABC extends USABankZ {
	

void loan() {
	System.out.println("loan from abc");
	
}

void save() {
	System.out.println("loan from abc");
	
}
public void branchName() {
	System.out.println("I am maryland branch from abc");
}


}
class XYZ extends USABankZ {
	
	


void loan() {
	System.out.println("loan from abc");
	
}


void save() {
	System.out.println("loan from abc");
	
}

public void branchName() {
	System.out.println("I am maryland branch from xyz");
}

}


