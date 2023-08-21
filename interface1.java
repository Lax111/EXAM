package praexam;

interface NepalBank{
	
	public void loan(int a);
	
	public void save(int b);
	
}
public class interface1 {

	public static void main(String[] args) {
		
		NCCA ncc = new NCCA();
		ncc.branchName();
		ncc.loan(0);
		ncc.save(0);
		
	NBV nbv = new NBV();
	nbv.branchName();
	nbv.loan(0);
	nbv.save(0);
	

	}

}

class NBV implements NepalBank{

	@Override
	public void loan(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(int b) {
		// TODO Auto-generated method stub
		
	}
	
	public void branchName() {
		System.out.println("I am nbv branch");
	
}
}
class NCCA implements NepalBank{

	@Override
	public void loan(int a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(int b) {
		// TODO Auto-generated method stub
		
	}
	public void branchName() {
		System.out.println("I am ncc branch");
	
	
}
}






