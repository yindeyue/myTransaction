package com.yindeyue.controller;

import java.util.Map;

import com.yindeyue.core.MyRequest;

/**
 * 元数据过滤器
 * 
 * @author yindeyue 2018年4月4日 上午10:40:50
 */
public class MyMetaFilter implements MyTransactionFilter {
	/**
	 * 缓存元数据
	 */
	private static ThreadLocal<Map<String, Object>> threadLocalHeader = new ThreadLocal<>();

	@Override
	public MyTransactionResult invoke(Map<String, Object> map, MyFilterChain myFilterChain, MyRequest request) {
		MyTransactionResult result = null;
		try {
			// 添加元数据
			addParentTransactionStatus(map, myFilterChain);
			// 缓存元数据
			threadLocalHeader.set(map);
			// 执行拦截器
			result = myFilterChain.invokeFilterChain(map, request);
		} finally {
			threadLocalHeader.remove();
		}
		return result;
	}

	private void addParentTransactionStatus(Map<String, Object> map, MyFilterChain myFilterChain) {
		int status = getTransactionStatus(myFilterChain.getAppId(), myFilterChain.getBussCode(),
				myFilterChain.getMethodName());
		map.put(MyTransactionConstant.PARENT_TRANSACTION_STATUS, status);
	}

	/**
	 * 获得事物状态
	 * 
	 * @param appId
	 * @param bussCode
	 * @param methodName
	 * @return
	 */
	private int getTransactionStatus(String appId, String bussCode, String methodName) {
		// 根据方法上的注解获得方法上需要的事物当前状态值
		return 0;
	}

	public static <T> T getMetaData(String key) {
		Map<String, Object> map = threadLocalHeader.get();
		if (map == null) {
			return null;
		}
		return (T) map.get(key);
	}
}
