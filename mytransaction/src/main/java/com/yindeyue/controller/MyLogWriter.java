package com.yindeyue.controller;

/**
 * 我的日志输出类
 * 
 * @author yindeyue 2018年4月3日 上午10:30:10
 */
public interface MyLogWriter {
	/**
	 * 开启新事物前向数据库中添加数据
	 * 
	 * @param appId
	 * @param bussCode
	 * @param trxId
	 * @param pAppId
	 * @param pBussCode
	 * @param pTrxId
	 * @param status
	 */
	public void writeExecuteFlag(String appId, String bussCode, String trxId, String pAppId, String pBussCode,
			String pTrxId, String status);
}
