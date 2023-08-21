package praexam;

enum Size{
	
	SMALL, MEDIUM, LARGE{
		
		
		class Order{
			Size PizzaSize;
			
			public  Order(Size PizzaSize) {
				
				this.PizzaSize = PizzaSize;
			}
			
			public void OrderConformation() {
				
			switch (PizzaSize) {
			
			case SMALL:
				System.out.println("Order small size pizza");
			
			break;
			
			case MEDIUM:
				System.out.println("Order medium size pizza");
			
			break;
			
			
			case LARGE:
				System.out.println("Order large size pizza");
			
			break;	
				
		}
	}
}


class ENUMWITHSWITCHCASEEXAM {

	public static void main(String[] args) {
		Order ord = new Order(Size.MEDIUM);
		ord.orderConformation();
	}

}
