package com.exotec.calc.component;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.exotec.calc.beans.CalcOperationBean;
import com.exotec.calc.beans.CalcResultBean;

@Component
public class CalcComponent implements ICalcComponent {

	@Override
	public CalcResultBean compute(CalcOperationBean operation) {
		int res = Arrays.asList(operation.getOperation().split("\\+")).stream().mapToInt(Integer::valueOf).sum();
		return new CalcResultBean(operation, res);
	}

	
}
