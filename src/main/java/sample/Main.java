package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		if (logger.isInfoEnabled()) {
			logger.info("Hello world, Simple java app with maven");
		}
	}

}
