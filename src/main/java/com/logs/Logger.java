package com.logs;

import org.apache.logging.log4j.LogManager;

public class Logger {

	private static final org.apache.logging.log4j.Logger LOG = LogManager
			.getLogger(Thread.currentThread().getClass().getName());

	public static void logInfo(String msg) {
		LOG.info(msg);
	}

}
