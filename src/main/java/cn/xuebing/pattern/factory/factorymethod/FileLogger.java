package cn.xuebing.pattern.factory.factorymethod;

/**
 * <p>
 * File Logger Recoder : Concrete Product
 * </p>
 * Briefly describe what this class does.
 */
public class FileLogger implements Logger {

	@Override
	public void writeLogger() {
		System.out.println(" --- The log information will be write in file.");
	}

}
