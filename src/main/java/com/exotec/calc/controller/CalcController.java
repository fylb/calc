package com.exotec.calc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exotec.calc.beans.CalcOperationBean;
import com.exotec.calc.beans.CalcResultBean;
import com.exotec.calc.component.ICalcComponent;

@RestController
public class CalcController {

	@Autowired
	private ICalcComponent calcComponent;
	
	
	@PostMapping(value="/calc", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public CalcResultBean computeAsPost(@RequestBody CalcOperationBean operation) {
		return calcComponent.compute(operation);
	}

}