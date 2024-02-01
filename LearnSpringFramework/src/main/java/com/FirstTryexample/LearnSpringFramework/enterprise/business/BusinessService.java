package com.FirstTryexample.LearnSpringFramework.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.FirstTryexample.LearnSpringFramework.enterprise.web.data.DataService;

@Component
public class BusinessService {
	private DataService dataService;


@Autowired
public void setDataService(DataService dataService) {
	System.out.println("Setter Injection");
	this.dataService = dataService;
}
	
	





	public long calculateSum() {
		List<Integer> data = dataService.getData();
		// this will loop around the list and get the sum
		return data.stream().reduce(Integer::sum).get();

	}
}
