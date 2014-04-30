package cn.xuebing.pattern.factory.simple;

/**
 * Concrete Product.
 */
public class HistogramChart implements Chart {

	public HistogramChart() {
		System.out.println("Create Histogram");
	}

	@Override
	public void display() {
		System.out.println("Show Histogram");
	}
}
