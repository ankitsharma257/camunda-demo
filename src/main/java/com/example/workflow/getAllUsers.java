package com.example.workflow;

import java.util.List;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.TaskListener;

//com.example.workflow.getAllUsers
public class getAllUsers implements  ExecutionListener {

	 @Override
	   public void notify(DelegateExecution delegateExecution) throws Exception {
	     if (delegateExecution.getEventName().equals(TaskListener.EVENTNAME_CREATE)) {
	       List<String> testCollection = (List<String>) delegateExecution.getVariable("Name");
	       delegateExecution.setVariable("testCollection", testCollection);
	     }
	}
}
