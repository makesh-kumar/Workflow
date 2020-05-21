package com.demo;

import java.util.List;

import java.util.Map;

import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;

import org.springframework.beans.BeansException;

import org.springframework.context.ApplicationContext;

import org.springframework.context.ApplicationContextAware;

import com.demo.model.Product;

//public class StandardWorkflow implements Workflow, ApplicationContextAware {


public class StandardWorkflow{

	private final Log LOG = LogFactory.getLog(StandardWorkflow.class);

	private static final String ACTION = "action";

	private Map<String, List<WorkflowAction>> workflowActions;

	private ApplicationContext applicationContext;



	public boolean processWorkflow(String workflowName, Product parameters) {

		Context context = new StandardContext(parameters);
//	 System.out.println(context);
		List<WorkflowAction> actions = getWorkflowActions(workflowName);

		for (WorkflowAction action : actions) {

//			System.out.println(action.toString());
		
			try {
//				context.getAttribute("message");
//				System.out.println(context.getAttribute("emailId"));
//				System.out.println(context.getAttribute("map"));
				action.doAction(context);

			} 
			catch (Exception e) {

				StringBuilder message = new StringBuilder("Failed to complete action:" + action.toString());

				message.append('\n');

				message.append(e.getMessage());

				LOG.error(message.toString());

				return false;

			}

		}

		return true;

	}

	private List<WorkflowAction> getWorkflowActions(String actionName) {

		List<WorkflowAction> actions = workflowActions.get(actionName);

		if (actions == null || actions.isEmpty()) {

			LOG.error("There is no defined action for " + actionName);

			throw new IllegalArgumentException("There is no defined action for " + actionName);

		}

		return actions;

	}


	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}
	// Getter/Setter

	public Map<String, List<WorkflowAction>> getWorkflowActions() {

		return workflowActions;

	}

	public void setWorkflowActions(

			Map<String, List<WorkflowAction>> workflowActions) {

		this.workflowActions = workflowActions;

	}
}
