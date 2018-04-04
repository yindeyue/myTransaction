package com.yindeyue.controller;

import java.util.Map;

import com.yindeyue.core.MyRequest;

/**
 * 拦截器链接口
 * 
 * @author yindeyue 2018年4月4日 上午10:44:37
 */
public interface MyFilterChain {
	 String getAppId();
	 String getBussCode();
	 String getMethodName();
	/**
	 * 执行拦截器
	 * 
	 * @param header
	 * @param request
	 * @return
	 */
	MyTransactionResult invokeFilterChain(Map<String, Object> header, MyRequest request);
}
