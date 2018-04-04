package com.yindeyue.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yindeyue 2018年4月3日 上午10:24:19 日志上下文
 */
public class MyLogContext {
	/**
	 * 主事物最终状态
	 */
	private Boolean finalMasterStatus;
	/**
	 * 事物状态检查器
	 */
	private MyTransactionStatusChecker transactionChecker;
	/**
	 * 日志输出类
	 */
	private MyLogWriter logWriter;
	/**
	 * 缓存执行类
	 */
	private MyExecuteCacheManager executeCacheManager;
	/**
	 * 调用次数记录类
	 */
	private Map<String, AtomicInteger> callSeqMap = new HashMap<>();

	private AtomicInteger atomicInger = new AtomicInteger(1);

	public MyLogContext() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyLogContext(Boolean finalMasterStatus, MyTransactionStatusChecker transactionChecker,
			MyLogWriter logWriter,MyExecuteCacheManager executeCacheManager) {
		super();
		this.finalMasterStatus = finalMasterStatus;
		this.transactionChecker = transactionChecker;
		this.logWriter = logWriter;
		this.executeCacheManager=executeCacheManager;
	}

	public Boolean getFinalMasterStatus() {
		return finalMasterStatus;
	}

	public void setFinalMasterStatus(Boolean finalMasterStatus) {
		this.finalMasterStatus = finalMasterStatus;
	}

	public MyTransactionStatusChecker getTransactionChecker() {
		return transactionChecker;
	}

	public void setTransactionChecker(MyTransactionStatusChecker transactionChecker) {
		this.transactionChecker = transactionChecker;
	}

	public MyLogWriter getLogWriter() {
		return logWriter;
	}

	public void setLogWriter(MyLogWriter logWriter) {
		this.logWriter = logWriter;
	}

	public Map<String, AtomicInteger> getCallSeqMap() {
		return callSeqMap;
	}

	public void setCallSeqMap(Map<String, AtomicInteger> callSeqMap) {
		this.callSeqMap = callSeqMap;
	}

	public MyExecuteCacheManager getExecuteCacheManager() {
		return executeCacheManager;
	}

	public void setExecuteCacheManager(MyExecuteCacheManager executeCacheManager) {
		this.executeCacheManager = executeCacheManager;
	}

	@Override
	public String toString() {
		return "MyLogContext [finalMasterStatus=" + finalMasterStatus + ", transactionChecker=" + transactionChecker
				+ ", logWriter=" + logWriter + "]";
	}

}
