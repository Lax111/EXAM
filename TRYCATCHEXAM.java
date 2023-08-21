package praexam;

public class TRYCATCHEXAM {

	public static void main(String[] args) {
		System.out.println("hello");

		try {
			System.out.println(50/0);
		}
		
		catch(ArithmeticException e){
			System.out.println("can not divide50 by 0");
		}
		System.out.println("bye");
	}

}
