package com.example.alpacaV21;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres"; // jdbc:mysql://127.0.0.1:3306/여러분이 만드신 스키마이름
	private static final String USER = "postgres"; //DB 사용자명
	private static final String PW = "postgres";   //DB 사용자 비밀번호
	
	@Test
	public void testConnection() throws Exception{
	 Class.forName(DRIVER);
	 
	 try(Connection con = DriverManager.getConnection(URL, USER, PW)){
	  System.out.println("성공");
	  System.out.println(con);
	 }catch (Exception e) {
	  System.out.println("에러발생");
	  e.printStackTrace();
	 }
	}

}
