package praexam;

import java.util.HashMap;
import java.util.Map;

public class HASHMAPEXAM {

	public static void main(String[] args) {
		
		
	Map<String,String>	employee = new HashMap<String,String>();
		
	employee.put("empFirstName", "lax");
	employee.put("emplastName", "chapagain");
	employee.put("emprollNo", "10");
		
		
		
	for(String zzz: employee.keySet()) {
		System.out.println(zzz);
	}
	
	for(String xxx: employee.values()) {
		System.out.println(xxx);
	}	

	}

}
