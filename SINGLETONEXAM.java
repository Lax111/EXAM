package praexam;

public class SINGLETONEXAM {

	public static void main(String[] args) {
		

		
		DocumentSS docs = DocumentSS.getInstance();
		docs.gerConnection();
	}

}
class DocumentSS{
	
	private static DocumentSS docs;
	
	private DocumentSS(){
		
		
	}
	public static DocumentSS getInstance() {
		
		if(docs == null) {
			docs = new DocumentSS();	
	}
		return docs;
		
	}
	public void gerConnection() {
		System.out.println("connection to documents");
	}
}