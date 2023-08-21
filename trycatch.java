package praexam;

public class trycatch {

	public static void main(String[] args) {
		
		
		
//	System.out.println("hello");	
//	System.out.println(5/0);
//	System.out.println("bye");
////		
		
	//System.out.println("hello");
	
	try {
		
		int divideByZero =5/0;
		System.out.println("rest");
		
	}
	catch (ArithmeticException e)	{
		
		System.out.println(e.getMessage());

	}


	}
}
