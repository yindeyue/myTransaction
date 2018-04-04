package com.yindeyue.controller;
/**
 * 我的缓存执行类
 * @author yindeyue
 * 2018年4月4日 下午4:48:48
 */

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import com.yiqiniu.easytrans.core.ExecuteCacheManager.CompensableCallerWrapper;
import com.yiqiniu.easytrans.core.ExecuteCacheManager.ExecuteTriggerByGetFuture;

public class MyExecuteCacheManager {
	public <T> Future<T> cacheCall(Callable<T> callable, MyContent myContent) {
		logCtx.getLogCache().cacheLogList(Arrays.asList(content));
		mapCallable.put(compensableCall, new Object[3]);
		CompensableCallerWrapper<T> compensableCallWrapper = new CompensableCallerWrapper<T>(compensableCall);
		Future<T> future = new ExecuteTriggerByGetFuture<T>(compensableCallWrapper);
		return future;
	}
}
