package com.demo.actions;

import java.util.Scanner;

import com.demo.Context;
import com.demo.WorkflowAction;

public class ActionThree implements WorkflowAction {

	public ActionThree() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public void doAction(Context context) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Really want to change colour ? (y/N)");
		String inp = scanner.nextLine();
		if(inp.equalsIgnoreCase("y")) {
			context.setAttribute("colour", "Orange"); 	
		}
		
		else {
			
		}
		System.out.println(context);
		System.out.println(context.getAttribute("colour"));
	}

}
