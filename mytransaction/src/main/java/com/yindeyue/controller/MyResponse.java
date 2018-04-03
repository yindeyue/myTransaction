package com.yindeyue.controller;

import java.io.Serializable;

/**
 * @author yindeyue 2018年4月2日 下午3:24:54 我的响应类
 */
public class MyResponse implements Serializable {
	// 对应的请求id
	private Integer requestId;
	// 响应内容
	private Object result;
	// 响应异常
	private Throwable exception;

	public MyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyResponse(Integer requestId, Object result, Exception exception) {
		super();
		this.requestId = requestId;
		this.result = result;
		this.exception = exception;
	}

	public Integer getRequestId() {
		return requestId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public Throwable getException() {
		return exception;
	}

	public void setException(Throwable exception) {
		this.exception = exception;
	}

	@Override
	public String toString() {
		return "MyResponse [requestId=" + requestId + ", result=" + result + ", exception=" + exception + "]";
	}

	public void recreateException(){
		if (exception != null) {
			throw new RuntimeException(exception.getMessage());
		}
	}
}
