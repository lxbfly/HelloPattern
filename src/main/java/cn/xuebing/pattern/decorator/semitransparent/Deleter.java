package cn.xuebing.pattern.decorator.semitransparent;

/**
 * <p>
 * Concrete Component Decorator Class
 * </p>
 * Briefly describe what this class does.
 */
public class Deleter extends Decorator {

	public Deleter(Document doc) {
		super(doc);
	}

	public void approve() {
		System.out.println("deleter files");
	}
}
