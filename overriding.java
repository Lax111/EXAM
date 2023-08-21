package praexam;

public class overriding {

	public static void main(String[] args) {

		
		NCC nnn = new NCC("nepal", "kathmandu");
		
		nnn.displayMessage();
		nnn.save();
		nnn.loan();
		
	}

}

class NepalRastraBank {
	String country;

	public NepalRastraBank(String cnt) {
		this.country = cnt;
	}

	public void loan() {
		System.out.println("loan from nrb");
	}

	public void save() {
		System.out.println("save from nrb");
	}

	public void displayMessage() {
		System.out.println("welcome to Nepal Rastra Bank");
	}

}

class NBB extends NepalRastraBank {

	String branchName;

	public NBB(String cnt, String bn) {
		super(cnt);
		this.branchName = bn;

	}

	public void save() {
		System.out.println("save from nbb");
	}

	public void loan() {
		System.out.println("loan from nbb");
	}

}
class NCC extends NepalRastraBank{

String branchname;

	public NCC(String cnt,String bn) {
		super(cnt);
		this.branchname = bn;
	}

	public void save() {
		System.out.println("save from ncc");
	}

	public void loan() {
		System.out.println("loan from ncc");
	}

}



