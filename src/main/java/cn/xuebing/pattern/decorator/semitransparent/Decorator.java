package cn.xuebing.pattern.decorator.semitransparent;

/**
 * <p>
 * Decorator Class
 * </p>
 * Briefly describe what this class does.
 */
public class Decorator implements Document {

	private Document doc;

	public Decorator(Document doc) {
		super();
		this.doc = doc;
	}

	@Override
	public void display() {
		doc.display();
	}

}
