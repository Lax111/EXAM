package praexam;

public class abstracts {

	public static void main(String[] args) {

		
		PBB baltimore = new PBB();
		baltimore.branchName();
		baltimore.displayCountry();
		baltimore.save();
		baltimore.loan();
			
	}
}

abstract class USABank2 {

	abstract void loan();

	abstract void save();

	public void displayCountry() {
	}
}

class PBB extends USABank2 {

	@Override
	void loan() {

	}

	@Override
	void save() {

	}

	public void branchName() {
		System.out.println("I am maryland branch -pbb");
	}
}

class DBB extends USABank2 {

	@Override
	void loan() {

	}

	@Override
	void save() {

	}

	public void branchName() {
		System.out.println("I am maryland branch  -dbb");

	}
}
