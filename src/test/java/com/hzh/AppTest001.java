package com.hzh;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

public class AppTest001 {

	/*
	 * log4j -> log4j-over-slf4j -> logback
	 */
	@Test
	public void test001() {
		Logger logger = LogManager.getLogger(AppTest001.class);

		logger.trace("trace!!!");
		logger.debug("debug!!!");
		logger.info("info!!!");
		logger.warn("warn!!!");
		logger.error("error!!!");
	}

}
