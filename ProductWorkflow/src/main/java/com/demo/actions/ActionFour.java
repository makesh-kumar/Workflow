package com.demo.actions;

import com.demo.Context;
import com.demo.WorkflowAction;

public class ActionFour implements WorkflowAction {

	public ActionFour() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public void doAction(Context context) throws Exception {
		// TODO Auto-generated method stub
		context.setAttribute("colour", "Black");	System.out.println(context);
		System.out.println(context.getAttribute("colour"));
	}

}
