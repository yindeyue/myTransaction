package com.yindeyue.request;

import java.io.Serializable;

import com.yindeyue.controller.MyTransactionExecutor;
import com.yindeyue.core.MyRequest;

/**
 * TCC请求
 * 
 * @author yindeyue 2018年4月4日 下午2:52:37
 * @param <T>
 */
public interface MyTCCRequest<T extends Serializable> extends MyRequest<T, MyTransactionExecutor> {
}
