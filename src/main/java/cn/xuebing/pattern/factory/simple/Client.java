package cn.xuebing.pattern.factory.simple;

public class Client {

	public static void main(String[] args) {
		Chart chart = null;

		chart = Factory.factory("histogram");
		chart.display();
	}

}
