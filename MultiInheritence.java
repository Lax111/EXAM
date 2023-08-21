package praexam;

public class MultiInheritence {

	public static void main(String[] args) {
		
		Son ram  = new Son("govinda", "sharma", "madhav", "ram");
		System.out.println(ram.firstName);
		System.out.println(ram.lastName);
		System.out.println(ram.fFirstName);
		System.out.println(ram.sName);
		
		ram.displayGname();
		ram.displayfName();
		ram.displaysName();
		
		
}}

class GrandFather{
	
	String firstName;
	String lastName;
	
	public GrandFather(String firstname,String lastname) {
	this.firstName = firstname;
	this.lastName = lastname;
}
	
	public void displayGname() {
		System.out.println(this.firstName+ this.lastName);
		
		
	}}

class Father extends GrandFather{
String fFirstName;

	public Father(String firstname, String lastname, String ffn) {
		super(firstname, lastname);
		this.fFirstName = ffn;	
	}
		
	public void displayfName()	{
		System.out.println(this.fFirstName+ this.lastName);
		
	}
}

class Son extends Father{
String sName;

	public Son(String firstname, String lastname,String ffn,String sn) {
		super(firstname, lastname, ffn);
		this.sName = sn;
		
	}	
	public void displaysName()	{
		System.out.println(this.sName+this.lastName);
	}
		
		
		
		
}
		
		
	
		
		
		
	