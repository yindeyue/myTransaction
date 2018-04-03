package com.yindeyue.controller;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;

/**
 * @author yindeyue
 * 2018年4月2日 下午3:21:38
 * 集成Spring
 */
@Component
public class MyTransactionSynchronization extends TransactionSynchronizationAdapter {
	@Override
	public void beforeCommit(boolean readOnly) {
		
		super.beforeCommit(readOnly);
	}

	@Override
	public void afterCompletion(int status) {
		System.out.println("afterCompletion!");
		super.afterCompletion(status);
	}
}
