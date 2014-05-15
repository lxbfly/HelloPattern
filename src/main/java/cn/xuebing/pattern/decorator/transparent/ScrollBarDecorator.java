package cn.xuebing.pattern.decorator.transparent;

/**
 * <p>
 * ScrollBar Class : Concrete Decorator Class
 * </p>
 * Briefly describe what this class does.
 */
public class ScrollBarDecorator extends ComponentDecorator {

	public ScrollBarDecorator(Component component) {
		super(component);
	}

	public void display() {
		this.setScrollBar();
		super.display();
	}

	public void setScrollBar() {
		System.out.println("Add ScrollBar...");
	}
}