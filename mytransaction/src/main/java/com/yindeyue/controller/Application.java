package com.yindeyue.controller;

import java.util.concurrent.Future;

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

import com.yindeyue.core.MyResponse;
import com.yindeyue.request.method.demo.MyWalletPayTCCMethod.MyTCCRequestMethodResult;
import com.yindeyue.request.method.demo.MyWalletPayTCCMethod.MyWalletPayTCCMethodRequest;

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
		jdbcTemplate.execute("insert into student(name,age) values('yindeyue',27)");
		myTransaction.startMyTransaction("buy", "1");
		MyWalletPayTCCMethodRequest walletPayTCCMethodRequest = new MyWalletPayTCCMethodRequest();
		walletPayTCCMethodRequest.setUserId(1);
		walletPayTCCMethodRequest.setAmount(222.34);
		Future<MyTCCRequestMethodResult> execute = myTransaction.execute(walletPayTCCMethodRequest);
		return "ok";
	}
}
