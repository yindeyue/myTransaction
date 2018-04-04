package com.yindeyue.controller;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ TYPE })
@Retention(RUNTIME)
public @interface BusinessAnnotation {
	String appId();

	String BussCode();

	int rpcTimeOut() default 0;
}
