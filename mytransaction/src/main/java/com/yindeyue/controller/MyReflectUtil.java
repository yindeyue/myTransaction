package com.yindeyue.controller;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yindeyue.core.MyRequest;

/**
 * 反射工具类
 * 
 * @author yindeyue 2018年4月4日 下午2:29:27
 */
public class MyReflectUtil {
	private MyReflectUtil() {
	};

	@SuppressWarnings("rawtypes")
	public static Class<?> getClass(Type type) {
		if (type instanceof Class) {
			return (Class) type;
		} else if (type instanceof ParameterizedType) {
			System.out.println(Arrays.toString(((ParameterizedType) type).getActualTypeArguments()));
			return getClass(((ParameterizedType) type).getRawType());
		}
		return null;
	}

	public static List<Class<?>> getType(Class<MyRequest> class1, Class<?> class12) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		A a = new A<String>();
		a.t = "yindeyue";

		System.out.println(getClass(a.getClass()));
	}
}

class A<T> {
	T t;
}