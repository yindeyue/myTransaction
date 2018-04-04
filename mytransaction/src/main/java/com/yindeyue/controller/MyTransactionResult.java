package com.yindeyue.controller;

import java.io.Serializable;

public class MyTransactionResult implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 返回结果
	 */
	private Object result;
	/**
	 * 返回的异常
	 */
	private Throwable exception;

	/**
	 * 重建异常
	 * 
	 * @throws Throwable
	 */
	public Object reCreate() throws Throwable {
		if (exception != null) {
			throw exception;
		}
		return result;
	}

	public MyTransactionResult() {
		super();
	}

	public MyTransactionResult(Object result, Throwable exception) {
		super();
		this.result = result;
		this.exception = exception;
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
		return "MyTransactionResult [result=" + result + ", exception=" + exception + "]";
	}
}
