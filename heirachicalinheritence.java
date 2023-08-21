package praexam;

public class heirachicalinheritence {

	public static void main(String[] args) {

		
		SonW ram1 = new SonW("givind", "sharma", "ram1");
		
//		System.out.println(ram1.firstName);
//		System.out.println(ram1.lastName);
//		System.out.println(ram1.firstName);
		
		
		Daughter sanvi = new Daughter("govindaa", "sharma", "sanvi");
		
//		
		
		sanvi.displayDname();
		sanvi.displayfname();
		
		ram1.displayfname();
		ram1.displaysname();
		
	}

}

class FatherW {

	String firstName;
	String lastName;

	public FatherW(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;

	}

	public void displayfname() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonW extends FatherW {
	String sFirstName;

	public SonW(String firstname, String lastname, String sfn) {
		super(firstname, lastname);
		this.sFirstName = sfn;
	}

	public void displaysname() {
		System.out.println(this.sFirstName + this.lastName);
	}

}

class Daughter extends FatherW {
	String dFirstName;

	public Daughter(String firstname, String lastname, String dfn) {
		super(firstname, lastname);
		this.dFirstName = dfn;
	}

	public void displayDname() {
		System.out.println(this.dFirstName + this.lastName);
	}

}
