package praexam;

public class Innerclass {

	public static void main(String[] args) {
		
		
		OrgaincGreenTea orgt = new OrgaincGreenTea() ;
			orgt.OrganicTeaTest();
			
			OrgaincGreenTea.MilkTea mt = orgt.new MilkTea();
			mt.MilkTea();
			
	}}

class OrgaincGreenTea{
	
	public void OrganicTeaTest() {
		System.out.println("this is organic tea");
	}
	
	class MilkTea{
		
		public void MilkTea() {
			System.out.println("this is green tea");
			
		}
	}
	
}