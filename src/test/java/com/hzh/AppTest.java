package com.hzh;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTest {

	/*
	 * 简单使用 slf4j-simple
	 */
	@Test
	public void test001() {
		Logger logger = LoggerFactory.getLogger(AppTest.class);
		logger.trace("trace!!!");
		logger.debug("debug!!!");
		logger.info("info!!!");
		logger.warn("warn!!!");
		logger.error("error!!!");
	}

	/*
	 * 简单使用 slf4j-simple 字符串拼接
	 */
	@Test
	public void test002() {
		String name = "zhangsan";
		int age = 27;

		Logger logger = LoggerFactory.getLogger(AppTest.class);
		logger.info("我叫：{}, 今年{}岁。", name, age);
	}

	/*
	 * 简单使用 slf4j-simple 记录异常信息
	 */
	@Test
	public void test003() {
		
		Logger logger = LoggerFactory.getLogger(AppTest.class);
		try {
			Class.forName("aaa");
		} catch (Exception e) {
			logger.info("发生了异常：", e);
		}
	}

}
