package praexam;

public class ABSTRACTEXAM {

	public static void main(String[] args) {
		
	}

}
abstract class USABankZZZ{
	
	abstract void loan();
	abstract void save();
	
	public void displayCountry() {
		
		PBA baltimore = new PBA();
		baltimore.branchName();
		baltimore.loan();
		baltimore.save();
		baltimore.displayCountry();
		
	}
}
class PBBZ extends USABankZZZ{

	
	void loan() {
		System.out.println("loan from pbb");
		
	}

	
	void save() {
		System.out.println("save from pbb");
		
	}
	
	public void branchName() {
		System.out.println("I am  maryland branch from pbb");
	}
}

class PBA extends USABankZZZ{

	
	void loan() {
		System.out.println("loan from pba");
		
	}

	
	void save() {
		System.out.println("save from pba");
		
	}
	public void branchName() {
		System.out.println("I am  maryland branch from pba");
	
}
}





