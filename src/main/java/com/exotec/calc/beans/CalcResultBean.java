package com.exotec.calc.beans;

public class CalcResultBean {

	private int result;
	private CalcOperationBean operation;

	public CalcResultBean(CalcOperationBean operation, int result) {
		super();
		this.operation = operation;
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public CalcOperationBean getOperation() {
		return operation;
	}

	public void setOperation(CalcOperationBean operation) {
		this.operation = operation;
	}
}
