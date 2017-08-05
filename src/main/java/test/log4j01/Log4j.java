package test.log4j01;

import org.apache.log4j.Logger;

public class Log4j {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(Log4j.class);

	public static void main(String[] args) {
		if (logger.isDebugEnabled()) {
			logger.debug("main(String[]) - start");
		} 

		if (logger.isDebugEnabled()) {
			logger.debug("main(String[]) - end");
		}
	}

}
