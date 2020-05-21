package com.demo.actions;

import com.demo.Context;
import com.demo.WorkflowAction;

public class ActionFive implements WorkflowAction {

	public ActionFive() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public void doAction(Context context) throws Exception {
		// TODO Auto-generated method stub
		context.setAttribute("colour", "White");
		System.out.println(context);
		System.out.println(context.getAttribute("colour"));
	}

	
	
}
