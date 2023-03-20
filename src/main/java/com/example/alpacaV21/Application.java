package com.example.alpacaV21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //클래스가 무슨 역할을 하는지 힌트를 제공하는 스테레오 타입 주석
@SpringBootApplication //이 주석은 메타 주석 이라고 하며 @SpringBootConfiguration, @EnableAutoConfiguration및 @ComponentScan 를 결합합니다.
                       //@EnableAutoConfiguration 자동설정?을 하는 역할
public class Application {

	@RequestMapping("/") //라우팅 정보를 제공하는 주석
	String home() {
		return "Hello World!";
	}
	// java 표준 main 함수
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}