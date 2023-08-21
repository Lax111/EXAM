package praexam;

interface USABank{
	
	public void save(int a);
	
	public void loan(int b);
	
}

public class Interface {

	public static void main(String[] args) {
		
		PNC ppp = new PNC();
		ppp.loan(0);
		ppp.save(0);
		
		CITY ccc = new CITY();
		ccc.loan(0);
		ccc.save(0);
		
		
	}

}
class PNC implements USABank {

	
	public void save(int a) {
			System.out.println("save from pnc");
	}

	public void loan(int b) {
		System.out.println("loan from pnc");
	}
	
}
class CITY implements USABank{

	
	public void save(int a) {
		System.out.println("save from pnc");
	}

	public void loan(int b) {
		System.out.println("loan from pnc");
		
	}
	
}
	
	
	
	
	
	



