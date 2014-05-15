package cn.xuebing.pattern.decorator.transparent;

/**
 * <p>
 * BlackBorder Decorator Class : Concrete Decorator Class
 * </p>
 * Briefly describe what this class does.
 */
public class BlackBorderDecorator extends ComponentDecorator {

	public BlackBorderDecorator(Component component) {
		super(component);
	}

	public void display() {
		this.setBlackBorder();
		super.display();
	}

	public void setBlackBorder() {
		System.out.println("Add BlackBorder...");
	}
}
