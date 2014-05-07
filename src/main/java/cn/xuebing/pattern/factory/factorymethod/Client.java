package cn.xuebing.pattern.factory.factorymethod;

import cn.xuebing.util.XmlUtil;

/**
 * <p>
 * Factory Method Client invoke Class
 * </p>
 * Briefly describe what this class does.
 */
class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;

		// TODO Directly new Class object
		// factory = new FileLoggerFactory();

		// TODO You can refence configuration file and reflecting.
		factory = (LoggerFactory) XmlUtil.getFactoryBean();

		logger = factory.createLogger();
		logger.writeLogger();
	}
}