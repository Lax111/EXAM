package praexam;

public class singleton1 {

	public static void main(String[] args) {
		

		
		Documents docss = Documents.getInstance();
		docss.getConnection();
	}

}


class Documents{
	
	private static Documents docss;
	
	private Documents() {
		
	}
	public static Documents getInstance() {
		if(docss == null) {
		docss = new Documents();
		
		}
			return docss;
		
	}
	public void getConnection() {
		System.out.println("connection to documents");
	}
	
}

