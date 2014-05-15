package cn.xuebing.pattern.decorator.transparent;

/**
 * <p>
 * Component Decorator Class : Abstractor decorator Class
 * </p>
 * Briefly describe what this class does.
 */
public class ComponentDecorator extends Component {

	private Component component;

	public ComponentDecorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void display() {
		component.display();
	}

}
