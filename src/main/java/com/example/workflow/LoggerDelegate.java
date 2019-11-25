package com.example.workflow;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
//com.example.workflow.LoggerDelegate
@Component
public class LoggerDelegate implements JavaDelegate {

	
	@Override
	public void execute(DelegateExecution execution) throws Exception {		
				
		System.out.println("Weather not ok!!!");

	}

}
