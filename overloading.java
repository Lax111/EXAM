package praexam;

public class overloading {

	public static void main(String[] args) {
		

		
		addW(10,8);
		addW(20,12,8);
		addW(30,18,10);
		
	}

	
public static void addW(int s, int t) {
	System.out.println(s+t);
}
	
public static void addW(int s, int t, int u) {
	System.out.println(s+t+u);
}
	
public static void addW(int s, int t,int u, int v) {
	System.out.println(s+t+u+v);
}
}