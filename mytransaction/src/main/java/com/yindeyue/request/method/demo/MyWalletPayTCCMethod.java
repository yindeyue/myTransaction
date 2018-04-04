package com.yindeyue.request.method.demo;

import javax.annotation.Resource;

import com.yindeyue.controller.MyTransactionResult;
import com.yindeyue.request.MyTCCRequest;
import com.yindeyue.request.method.MyTCCRequestMethod;
import com.yindeyue.request.method.demo.MyWalletPayTCCMethod.MyWalletPayTCCMethodRequest;
import com.yindeyue.service.WalletService;
import com.yindeyue.request.method.demo.MyWalletPayTCCMethod.MyTCCRequestMethodResult;

public class MyWalletPayTCCMethod implements MyTCCRequestMethod<MyWalletPayTCCMethodRequest, MyTCCRequestMethodResult> {
	@Resource
	private WalletService walletService;
	private static final long serialVersionUID = 1L;

	// @Override
	public MyTCCRequestMethodResult doTry(MyWalletPayTCCMethodRequest param) {
		return walletService.doTry(param);
	}

	// @Override
	public MyTCCRequestMethodResult doConfirm(MyWalletPayTCCMethodRequest param) {
		return walletService.doConfirm(param);
	}

	// @Override
	public MyTCCRequestMethodResult doCancel(MyWalletPayTCCMethodRequest param) {
		return walletService.doCancle(param);
	}

	public static class MyWalletPayTCCMethodRequest implements MyTCCRequest<MyTCCRequestMethodResult> {
		private static final long serialVersionUID = 1L;
		private Integer userId;
		private Double amount;

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

	}

	public static class MyTCCRequestMethodResult extends MyTransactionResult {

		private static final long serialVersionUID = 1L;
		private Double freezeAmount;

		public Double getFreezeAmount() {
			return freezeAmount;
		}

		public void setFreezeAmount(Double freezeAmount) {
			this.freezeAmount = freezeAmount;
		}
	}
}
