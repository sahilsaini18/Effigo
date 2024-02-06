package com.FirstTryexample.LearnSpringFramework.enterprise.business;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.FirstTryexample.LearnSpringFramework.enterprise.web.data.DataService;

@Component
public class BusinessService {
	private static final Logger log = Logger.getLogger(BusinessService.class.getName());

	private DataService dataService;

	@Autowired
	public void setDataService(DataService dataService) {
		log.info("Setter Injection");
		this.dataService = dataService;
	}

	public long calculateSum() {
		List<Integer> data = dataService.getData();
		// This will loop around the list and get the sum
		return data.stream().mapToLong(Integer::intValue).sum();
	}
}
