package cn.xuebing.pattern.decorator.transparent;

public class Client {

	public static void main(String[] args) {
		Component concreteComp, concreteCompDecoratorSB, concreteCompDecoratorBB;

		concreteComp = new Window();
		concreteCompDecoratorSB = new ScrollBarDecorator(concreteComp);
		// concreteCompDecoratorSB.display();

		// TODO Decorate more times
		concreteCompDecoratorBB = new BlackBorderDecorator(concreteCompDecoratorSB);
		concreteCompDecoratorBB.display();

	}

}
