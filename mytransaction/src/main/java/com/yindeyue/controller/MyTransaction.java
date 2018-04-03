package com.yindeyue.controller;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.web.client.RestTemplate;

/**
 * @author yindeyue 2018年4月2日 下午3:21:14 自定义事物
 */
@Component
public class MyTransaction {
	@Resource
	private RestTemplate restTemplate;
	@Resource
	private JdbcTemplate jdbcTemplate;

	/**
	 * 开启事物
	 * @param bussCode application中唯一标识
	 * @param trxId application+bussCode中唯一标识
	 */
	public void startMyTransaction(String bussCode,String trxId) {
		TransactionSynchronizationManager.registerSynchronization(new MyTransactionSynchronization());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(jdbcTemplate);
		jdbcTemplate.execute("insert into shiyan(id,age,account) value('qwe',23,12.34)");
	}

	public MyResponse execute(MyRequest request) {
		MyResponse forObject = restTemplate.getForObject("http://localhost:8081/hi?param={param}", MyResponse.class,
				request.getParam());
		return forObject;
	}
}
