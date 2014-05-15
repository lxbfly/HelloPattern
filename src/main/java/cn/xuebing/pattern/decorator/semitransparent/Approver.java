package cn.xuebing.pattern.decorator.semitransparent;

/**
 * <p>
 * Concrete Component Decorator Class
 * </p>
 * Briefly describe what this class does.
 */
public class Approver extends Decorator {

	public Approver(Document doc) {
		super(doc);
	}

	public void approver() {
		System.out.println("Approve files");
	}
}
