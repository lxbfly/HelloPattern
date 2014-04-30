package cn.xuebing.pattern.factory.simple;

import cn.xuebing.util.XmlUtil;

public class Client {

	public static void main(String[] args) {
		Chart chart = null;

		// chart = Factory.factory("histogram");

		String chartType = XmlUtil.getChartType();
		chart = Factory.factory(chartType);
		chart.display();
	}

}
