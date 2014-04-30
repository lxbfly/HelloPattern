package cn.xuebing.pattern.factory.simple;

/**
 * Concrete Product.
 */
public class LineChart implements Chart {

	public LineChart() {
		System.out.println("Create Line");
	}

	@Override
	public void display() {
		System.out.println("Show Line");
	}

}
