package com.jenkins.sample.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class JenkinsSampleControllerTest {

	@Test
	public void returnsGreetings() {
		JenkinsSampleController controller = new JenkinsSampleController();
		assertThat(controller.sayHello()).isEqualTo("Hello!!!");
	}

}
