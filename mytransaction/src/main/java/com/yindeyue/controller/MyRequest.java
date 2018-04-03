package com.yindeyue.controller;

import java.io.Serializable;

/**
 * @author yindeyue 2018年4月2日 下午3:21:56 我的请求类
 */
public class MyRequest implements Serializable{
	// 请求id
	private Integer id;
	// 请求地址
	private String url;
	// 请求参数
	private String param;

	public MyRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyRequest(Integer id, String url, String param) {
		super();
		this.id = id;
		this.url = url;
		this.param = param;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	@Override
	public String toString() {
		return "MyRequest [id=" + id + ", url=" + url + ", param=" + param + "]";
	}

}
