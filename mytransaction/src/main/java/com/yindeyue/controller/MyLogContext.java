package com.yindeyue.controller;

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

	public MyLogContext() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyLogContext(Boolean finalMasterStatus, MyTransactionStatusChecker transactionChecker,
			MyLogWriter logWriter) {
		super();
		this.finalMasterStatus = finalMasterStatus;
		this.transactionChecker = transactionChecker;
		this.logWriter = logWriter;
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

	@Override
	public String toString() {
		return "MyLogContext [finalMasterStatus=" + finalMasterStatus + ", transactionChecker=" + transactionChecker
				+ ", logWriter=" + logWriter + "]";
	}

}
