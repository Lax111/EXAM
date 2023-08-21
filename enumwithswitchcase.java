package praexam;

enum Size{
	
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

	class Order{
		Size pizasize;
		
		public Order(Size pizasize) {
			this.pizasize =pizasize; 
		}
		
		public void orderConformation() {
	
		switch (pizasize) {
		
		case SMALL:
			System.out.println("order small size pizza");
			break;
			
		case MEDIUM:
			System.out.println("order medium size pizza");
			break;
			
		case LARGE:
			System.out.println("order large size pizza");
		break;
		
		}}}

public class enumwithswitchcase {

	public static void main(String[] args) {
		Order ord = new Order(Size.LARGE);
		ord.orderConformation();

	}

}
