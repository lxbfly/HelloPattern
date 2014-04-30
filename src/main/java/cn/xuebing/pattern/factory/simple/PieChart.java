package cn.xuebing.pattern.factory.simple;

/**
 * Concrete Product.
 */
public class PieChart implements Chart {

	public PieChart() {
		System.out.println("Create Pie");
	}

	@Override
	public void display() {
		System.out.println("Show Pie");
	}

}
