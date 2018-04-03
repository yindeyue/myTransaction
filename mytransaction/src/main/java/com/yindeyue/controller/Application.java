package com.yindeyue.controller;

import javax.annotation.Resource;

import org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi.ecCVCDSA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Application {
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Resource
	private JdbcTemplate jdbcTemplate;
	@Resource
	private MyTransaction myTransaction;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping
	public String helloWorld() {
		return "hello world!";
	}

	@Transactional
	@GetMapping("/hi")
	public String myTransaction() throws Throwable {
		System.out.println(1);
		jdbcTemplate.execute("insert into student(name,age) values('yindeyue',27)");
		System.out.println(2);
		myTransaction.startMyTransaction();
		System.out.println(3);
		MyRequest myRequest = new MyRequest(1, "sadf", "shiyan");
		System.out.println(4);
		MyResponse execute = myTransaction.execute(myRequest);
		System.out.println(5);
		execute.recreateException();
		System.out.println(6);
		return "ok";
	}
}
