package com.aoezd.microservice.corenlp.smallnlp.healthcheck;

import com.codahale.metrics.health.HealthCheck;

public class TestHealthCheck extends HealthCheck {

	private String test;
	
	public TestHealthCheck(String test) {
		this.test = test;
	}

	@Override
	protected Result check() throws Exception {
		return test.equals("TestTest") ? Result.healthy() : Result.unhealthy("Field 'test' must be 'TestTest'!");
	}
}
