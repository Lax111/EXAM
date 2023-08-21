package praexam;

interface NepalSBankZZZ{
	
	public void loan(int x);
	public void save(int y);
	

public class INTERFACEEXAM {

	public static void main(String[] args) {
		
		
		NRB aaa = new NRB()	;
		aaa.loan(0);
		aaa.save(0);
		
		NBB bbb = new NBB();
		bbb.loan(0);
		bbb.save(0);
	
		
	}}	
		
		
	class NRB implements NepalSBankZZZ{

		
		public void loan(int x) {
			System.out.println("loan from nrb");
			
		}

		
		public void save(int y) {
			System.out.println("loan from nrb");
			
		}

		
		
	}

	class NBB implements NepalSBankZZZ{

		
		public void loan(int x) {
			System.out.println("loan from nrb");
			
		}

		
		public void save(int y) {
			System.out.println("loan from nrb");
			
		}
	

	
	}
	

