package com.ssafy.board;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssafy.member.model.MemberDto;
import com.ssafy.member.model.service.MemberService;

public class MemberTest extends UnitTestConfig {

	private final Logger log = LoggerFactory.getLogger(MemberTest.class);

	@Autowired
	private MemberService memberService;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("----- Class Test Start!!! -----");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("----- Class Test End!!! -----");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("----- Method Test Start!!! -----");
	}
	
	@After
	public void afterMethod() {
		System.out.println("----- Method Test Snd!!! -----");
	}
	
	@Test
//	@Ignore
	public void nullTest() {
//		if(userService != null) {
//			logger.debug("userService : {}", userService);
//		}
		log.debug("nullTest ...ing");
		assertNotNull(memberService);
//		assertNull(userService);
		log.debug("memberService : {}", memberService);
	}
	
	@Test
	public void dbConnectTest() throws SQLException {
		DataSource dataSource = context.getBean(DataSource.class);
		Connection conn = dataSource.getConnection();
		assertNotNull(conn);
		log.debug("db connection success : {}", conn);
	}
	
	@Test
//	@Ignore
	public void login() throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", "ssafy");
		map.put("userpwd", "1234");
		MemberDto memberDto = memberService.loginMember(map);
		assertNotNull(memberDto);
//		log.debug("memberDto : {}", memberDto);
		assertEquals(memberDto.getUserName(), "김싸피");
	}
	
}