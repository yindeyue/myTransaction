package com.yindeyue.request.method;

import java.io.Serializable;

import com.yindeyue.controller.MyMethodTransStatus;
import com.yindeyue.controller.MyTransactionConstant;
import com.yindeyue.request.MyTCCRequest;

public interface MyTCCRequestMethod<P extends MyTCCRequest<T>, T extends Serializable> extends MyTCCRequest<T> {
	@MyMethodTransStatus(MyTransactionConstant.TRANSACTIONASTATUS_UNKNOW)
	public T doTry(P param);

	@MyMethodTransStatus(MyTransactionConstant.TRANSACTIONASTATUS_COMMITIED)
	public T doConfirm(P param);

	@MyMethodTransStatus(MyTransactionConstant.TRANSACTIONASTATUS_ROLLBACK)
	public T doCancel(P param);
}
