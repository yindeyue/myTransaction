package com.yindeyue.service;

import com.yindeyue.request.method.demo.MyWalletPayTCCMethod.MyTCCRequestMethodResult;
import com.yindeyue.request.method.demo.MyWalletPayTCCMethod.MyWalletPayTCCMethodRequest;

public class WalletService{

	public MyTCCRequestMethodResult doTry(MyWalletPayTCCMethodRequest param) {
		System.out.println("WalletService.doTry");
		return new MyTCCRequestMethodResult();
	}

	public MyTCCRequestMethodResult doConfirm(MyWalletPayTCCMethodRequest param) {
		System.out.println("WalletService.doConfirm");
		return new MyTCCRequestMethodResult();
	}

	public MyTCCRequestMethodResult doCancle(MyWalletPayTCCMethodRequest param) {
		System.out.println("WalletService.doCancle");
		return new MyTCCRequestMethodResult();
	}

}
