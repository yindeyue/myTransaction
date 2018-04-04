package com.yindeyue.controller;

import java.io.Serializable;
import java.util.concurrent.Future;

import com.yindeyue.core.MyRequest;
import com.yiqiniu.easytrans.executor.EasyTransExecutor;
import com.yiqiniu.easytrans.protocol.EasyTransRequest;

/**
 * 开启分布式事物
 * 
 * @author yindeyue 2018年4月4日 下午4:24:32
 */
public interface MyFacade {
	/**
	 * 开启事物
	 * 
	 * @param callSeq
	 * @param param
	 * @return
	 */
	public <R extends Serializable, T extends Serializable, E extends MyTransactionExecutor, P extends MyRequest<T, E>> Future<R> execute(
			Integer callSeq, P param);
	/**
	 * 执行方法
	 * @param params
	 * @return
	 */
	public <P extends MyRequest<R,E>,E extends MyTransactionExecutor, R extends Serializable> Future<R> execute(P params);
}
