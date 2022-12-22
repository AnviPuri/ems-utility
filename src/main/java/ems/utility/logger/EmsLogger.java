package ems.utility.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmsLogger {

	public static Logger getLogger(String className) {
		return LoggerFactory.getLogger(className);
	}

	public static void log(String message, Logger logger) {
		logger.info(message);
	}

}
