package com.example.workflow;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
//com.example.workflow.resto
@Component
public class resto implements JavaDelegate 
{
	@Override
	public void execute(DelegateExecution execution) throws Exception {		
		String a = (String) execution.getVariable("Name");
		ArrayList<String> users = new ArrayList<String>();
		users.add(a);
		System.out.println(users);
		execution.removeVariable("Name");
		execution.removeVariable("value");
		execution.setVariable("users", users);
	}

}
