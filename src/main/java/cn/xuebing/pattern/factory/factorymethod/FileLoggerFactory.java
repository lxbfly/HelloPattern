package cn.xuebing.pattern.factory.factorymethod;

/**
 * <p>
 * File Log Recoder Factory Class : Concrete Factory
 * </p>
 * Briefly describe what this class does.
 */
public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// TODO Omited about something business logic
		Logger logger = new FileLogger();
		return logger;
	}

}
