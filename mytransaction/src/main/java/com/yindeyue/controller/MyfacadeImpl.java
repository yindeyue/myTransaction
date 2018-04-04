package com.yindeyue.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.ApplicationContext;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.yindeyue.core.MyRequest;

public class MyfacadeImpl implements MyFacade {
	private ApplicationContext application;
	private MySynchronizer mySynchronizer;

	public MyfacadeImpl(ApplicationContext application, MySynchronizer mySynchronizer) {
		super();
		this.application = application;
		this.mySynchronizer = mySynchronizer;
	}
	@Override
	public <R extends Serializable, T extends Serializable, E extends MyTransactionExecutor, P extends MyRequest<T, E>> Future<R> execute(
			Integer callSeq, P param) {
		return mySynchronizer.s
	}

	@Override
	public <P extends MyRequest<R, E>, E extends MyTransactionExecutor, R extends Serializable> Future<R> execute(
			P params) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 缓存请求与对应的执行器
	 */
	private ConcurrentHashMap<Class<?>, MyTransactionExecutor> executorsMap = new ConcurrentHashMap<>();

	/**
	 * 开启事物
	 * 
	 * @param bussCode
	 *            application中唯一标识
	 * @param trxId
	 *            application+bussCode中唯一标识
	 */
//	@Override
//	public void startMyTransaction(String bussCode, String trxId) {
//		TransactionSynchronizationManager.registerSynchronization(new MyTransactionSynchronization());
//		MyLogContext logContext = new MyLogContext(null, transactionStatusChecker, logWriter);
//		TransactionSynchronizationManager.bindResource(MY_LOG_CONTEXT, logContext);
//		// 获得方法上要求的事物的状态
//		MyTransactionId transactionId = getParentTransactionId();
//		if (transactionId == null) {
//			logWriter.writeExecuteFlag(applicationName, bussCode, trxId, null, null, null,
//					MyTransactionConstant.TRANSACTIONASTATUS_COMMITIED);
//		} else {
//			String metaData = MyMetaFilter.getMetaData(MyTransactionConstant.PARENT_TRANSACTION_STATUS);
//			if (metaData == null) {
//				metaData = MyTransactionConstant.TRANSACTIONASTATUS_UNKNOW;
//			}
//			logWriter.writeExecuteFlag(applicationName, bussCode, trxId, transactionId.getAppId(),
//					transactionId.getBussCode(), transactionId.getTrxId(), metaData);
//		}
//	}
//
//	private MyTransactionId getParentTransactionId() {
//		return MyMetaFilter.getMetaData(MyTransactionConstant.PARENT_TRANSACTION_ID);
//	}

//	@Override
//	public <P extends MyRequest<R, E>, E extends MyTransactionExecutor, R extends Serializable> Future<R> execute(
//			P params) {
//		BusinessAnnotation businessAnnotation = params.getClass().getAnnotation(BusinessAnnotation.class);
//		MyTransactionExecutor e = getExecutor(params.getClass());
//		MyLogContext myLogContext = (MyLogContext) TransactionSynchronizationManager.getResource(MY_LOG_CONTEXT);
//		Map<String, AtomicInteger> callSeqMap = myLogContext.getCallSeqMap();
//		String callSeqKey = businessAnnotation.appId() + "_" + businessAnnotation.BussCode();
//		AtomicInteger callSeq = callSeqMap.get(callSeqKey);
//		if (callSeq == null) {
//			callSeq = new AtomicInteger(0);
//			callSeqMap.put(callSeqKey, callSeq);
//		}
//		return e.execute(callSeq.incrementAndGet(), params);
//	}

//	/**
//	 * 根据class查找对应的执行类
//	 * 
//	 * @param class1
//	 * @return
//	 */
//	private MyTransactionExecutor getExecutor(Class<? extends MyRequest> class1) {
//		MyTransactionExecutor myTransactionExecutor = executorsMap.get(class1);
//		if (myTransactionExecutor == null) {
//			Class<?> executorClass = findMyexecutor(class1);
//			myTransactionExecutor = (MyTransactionExecutor) application.getBean(executorClass);
//			executorsMap.put(executorClass, myTransactionExecutor);
//		}
//		return myTransactionExecutor;
//	}

//	private Class<?> findMyexecutor(Class<?> class1) {
//		List<Class<?>> clazzs = MyReflectUtil.getType(MyRequest.class, class1);
//		if (clazzs != null && clazzs.size() >= 2) {
//			return clazzs.get(1);
//		}
//		return null;
//	}

	public ApplicationContext getApplication() {
		return application;
	}

	public void setApplication(ApplicationContext application) {
		this.application = application;
	}

	public MySynchronizer getMySynchronizer() {
		return mySynchronizer;
	}

	public void setMySynchronizer(MySynchronizer mySynchronizer) {
		this.mySynchronizer = mySynchronizer;
	}

	public ConcurrentHashMap<Class<?>, MyTransactionExecutor> getExecutorsMap() {
		return executorsMap;
	}

	public void setExecutorsMap(ConcurrentHashMap<Class<?>, MyTransactionExecutor> executorsMap) {
		this.executorsMap = executorsMap;
	}

	@Override
	public String toString() {
		return "MyfacadeImpl [application=" + application + ", mySynchronizer=" + mySynchronizer + ", executorsMap="
				+ executorsMap + "]";
	}

}
