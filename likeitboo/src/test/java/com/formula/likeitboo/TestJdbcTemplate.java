package com.formula.likeitboo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {

	private final static JdbcTemplate jdbcTemplate;
	private final static BeanFactory factory = new ClassPathXmlApplicationContext(
			"classpath*:spring-jdbctemplate.xml");
	static {
		jdbcTemplate = (JdbcTemplate) factory.getBean("jdbcTemplate");
	}

	@Test
	public void TestCase1() {
		String sql = "SELECT * FROM TEST";
		
		System.out.println(jdbcTemplate.queryForInt(sql));
	}
}
