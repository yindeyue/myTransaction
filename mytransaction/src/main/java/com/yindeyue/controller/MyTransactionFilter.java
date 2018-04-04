package com.yindeyue.controller;

import java.util.Map;

import com.yindeyue.core.MyRequest;

/**
 * 我的事物拦截器
 * 
 * @author yindeyue 2018年4月4日 上午10:33:27
 */
public interface MyTransactionFilter {
	/**
	 * 执行拦截器
	 * 
	 * @return
	 */
	public MyTransactionResult invoke(Map<String, Object> map,MyFilterChain myFilterChain,MyRequest myRequest);
}
