package cn.xuebing.pattern.factory.factorymethod;

/**
 * <p>
 * Database Log Recoder Factory Class : Concrete Factory
 * </p>
 * Briefly describe what this class does.
 */
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {

		// TODO Omited something business logic
		Logger logger = new DatabaseLogger();
		return logger;
	}

}
