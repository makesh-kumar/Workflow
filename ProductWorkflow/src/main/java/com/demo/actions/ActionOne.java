package com.demo.actions;

import com.demo.Context;
import com.demo.WorkflowAction;

public class ActionOne implements WorkflowAction {

	public ActionOne() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public void doAction(Context context) throws Exception {
		// TODO Auto-generated method stub
		context.setAttribute("colour", "Blue");
		System.out.println(context); 
		System.out.println(context.getAttribute("colour"));
		
	}

}
