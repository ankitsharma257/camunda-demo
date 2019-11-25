package com.example.workflow;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
//com.example.workflow.CheakWeatherDelegate
@Component
public class CheakWeatherDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Random random = new Random();
		boolean a=random.nextBoolean();
		System.out.println(a);
		execution.setVariable("name", "Ankit");
		execution.setVariable("weatherOK",a);

	}

}
