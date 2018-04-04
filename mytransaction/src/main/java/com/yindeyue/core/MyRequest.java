package com.yindeyue.core;

import java.io.Serializable;

import com.yindeyue.controller.MyTransactionExecutor;

/**
 * @author yindeyue 2018年4月2日 下午3:21:56 我的请求类
 */
public interface MyRequest<T extends Serializable,E extends MyTransactionExecutor> extends Serializable{

}
