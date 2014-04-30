package cn.xuebing.pattern.factory.simple;

public class Factory {

	public static Chart factory(String type) {
		Chart chart = null;

		if (type.equalsIgnoreCase("Histogram")) {
			chart = new HistogramChart();
		} else if (type.equalsIgnoreCase("PieChart")) {
			chart = new PieChart();
		} else if (type.equalsIgnoreCase("Line")) {
			chart = new LineChart();
		}
		return chart;
	}
}
