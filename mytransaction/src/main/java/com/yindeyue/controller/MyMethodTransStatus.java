package com.yindeyue.controller;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 方法上标注的事物状态
 * 
 * @author yindeyue 2018年4月4日 下午2:57:28
 */
@Target({ METHOD })
@Retention(RUNTIME)
public @interface MyMethodTransStatus {
	public String value();
}
