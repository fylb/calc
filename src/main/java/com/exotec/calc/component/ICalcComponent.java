package com.exotec.calc.component;

import com.exotec.calc.beans.CalcOperationBean;
import com.exotec.calc.beans.CalcResultBean;

public interface ICalcComponent {

	CalcResultBean compute(CalcOperationBean operation);

}
