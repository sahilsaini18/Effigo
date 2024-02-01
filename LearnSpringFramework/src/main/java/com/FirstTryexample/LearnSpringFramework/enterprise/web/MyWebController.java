package com.FirstTryexample.LearnSpringFramework.enterprise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.FirstTryexample.LearnSpringFramework.enterprise.business.BusinessService;

@Component
public class MyWebController {
	@Autowired
	private BusinessService businessService;
	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}

