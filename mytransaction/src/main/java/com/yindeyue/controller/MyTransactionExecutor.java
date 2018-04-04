package com.yindeyue.controller;

import java.io.Serializable;
import java.util.concurrent.Future;

import com.yindeyue.core.MyRequest;

/**
 * 方法执行器
 * @author yindeyue
 * 2018年4月4日 下午12:09:40
 */
public interface MyTransactionExecutor {
public <R extends Serializable,T extends Serializable,E extends MyTransactionExecutor,P extends MyRequest<T,E>> Future<R> execute(Integer callSeq,P param);
}
