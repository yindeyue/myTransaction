package com.yindeyue.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.web.client.RestTemplate;

import com.yindeyue.core.MyRequest;

/**
 * @author yindeyue 2018年4月2日 下午3:21:14 自定义事物
 */
@Component
public class MyTransaction {
	@Resource
	private RestTemplate restTemplate;
	@Resource
	private JdbcTemplate jdbcTemplate;
	
}
