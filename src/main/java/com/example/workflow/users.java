package com.example.workflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

public class users implements ExecutionListener {

	ArrayList<String> users = new ArrayList<String>();
	@Override
	public void notify(DelegateExecution execution) throws Exception {
		String a = (String) execution.getVariable("Name");
		users.add(a);
		execution.removeVariable("Name");
		execution.removeVariable("value");
		System.out.println(users);
		execution.setVariable("users", users);

	}

}
