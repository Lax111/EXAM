package praexam;

public class Inheritence {

	public static void main(String[] args) {
		
		StudentF sima = new StudentF("sima", "khanal");
		System.out.println(sima.firstName);
		System.out.println(sima.lastName);
		
		
		TeacherF simaa = new TeacherF("simaa", "sharma", 2000);
		System.out.println(simaa.firstName);
		System.out.println(simaa.lastName);
		System.out.println(simaa.salary);
		
		
		simaa.displaySalary();
		simaa.displaySname();	
	}
}

class StudentF{
	String firstName;
	String lastName;
	
	public StudentF(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displaySname() {
		System.out.println(this.firstName+this.lastName);
	}
	
}
class TeacherF extends StudentF{
	int salary;
	
	
	public TeacherF(String fn, String ln, int sal) {
		super(fn, ln);
		this.salary = sal;
	}	
	public void displaySalary() {
	System.out.println(this.salary);
	
}

}

