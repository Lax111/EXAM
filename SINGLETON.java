package praexam;

public class SINGLETON {

	public static void main(String[] args) {
		
		
		Document docs1 = Document.getinstance();
		docs1.getConnection();
	}

}

class Document{
	
	private static Document docs = null;
	
	private Document() {
		
	}
	public static Document getinstance() {
		if(docs == null) {
			docs = new Document();
			
		}
		return docs;
	}
	
	public void getConnection() {
		System.out.println("connected to documents");
	}
}