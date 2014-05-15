package cn.xuebing.pattern.decorator.semitransparent;

public class Client {

	public static void main(String[] args) {

		Document doc;
		doc = new PurchaseRequest();

		Approver newDoc;
		newDoc = new Approver(doc);

		newDoc.display();
		newDoc.approver();
	}

}
