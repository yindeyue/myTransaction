package com.yindeyue.controller;

public class MyTransactionId {
	private String appId;
	private String bussCode;
	private String trxId;

	public MyTransactionId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyTransactionId(String appId, String bussCode, String trxId) {
		super();
		this.appId = appId;
		this.bussCode = bussCode;
		this.trxId = trxId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getBussCode() {
		return bussCode;
	}

	public void setBussCode(String bussCode) {
		this.bussCode = bussCode;
	}

	public String getTrxId() {
		return trxId;
	}

	public void setTrxId(String trxId) {
		this.trxId = trxId;
	}

	@Override
	public String toString() {
		return "MyTransactionId [appId=" + appId + ", bussCode=" + bussCode + ", trxId=" + trxId + "]";
	}

}
