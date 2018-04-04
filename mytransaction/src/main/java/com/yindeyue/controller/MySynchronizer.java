package com.yindeyue.controller;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 同步执行器
 * 
 * @author yindeyue 2018年4月4日 下午4:28:17
 */
public class MySynchronizer {
	private static final String MY_LOG_CONTEXT = "MYLOGCONTEXT";
	private MyTransactionStatusChecker transactionStatusChecker;
	private MyLogWriter logWriter;
	private String applicationName;
	//怀疑就是这个类实现的回滚功能
	private MyConsistentGuardian myConsistentGuardian;
	public MySynchronizer(MyTransactionStatusChecker transactionStatusChecker, MyLogWriter logWriter,
			String applicationName, MyConsistentGuardian myConsistentGuardian) {
		super();
		this.transactionStatusChecker = transactionStatusChecker;
		this.logWriter = logWriter;
		this.applicationName = applicationName;
		this.myConsistentGuardian = myConsistentGuardian;
	}
	//创建线程池用来执行任务
	private ExecutorService executor=Executors.newCachedThreadPool();
	public <T> Future<T> executeMethod(Callable<T> call,MyContent content){
		MyLogContext myLogContext=getLogContext();
		return myLogContext.getExecuteCacheManager().
	}
}
