package com.demo;

import java.util.HashMap;
import java.util.Map;

import com.demo.model.Product;
 
/**
* Save states between different workflow action.
*
* @author igor.madjeric
*
*/
public class StandardContext implements Context 
{
 
	private Product context;
 
/**
* Create context object based.
*
* @param parameters
*/
	public StandardContext(Product parameters) 
	{
		if (parameters == null) 
		{
			this.context = null;
		} 
		else 
		{
			this.context = parameters;
		}
	}
 

	public Object getAttribute(String name) 
	{
		if(name.equals("name")) {
			return context.getProduct_name();
		}
		else if(name.equals("id")) {
			return context.getProduct_id();
		}
		else if(name.equals("colour")) {
			return context.getProduct_colour();
		}
		return null;
	}
	 

	public void setAttribute(String name, String value) 
	{
				context.setProduct_colour(value);
	}

	@Override
	public String toString() {
		return "StandardContext [context=" + context + "]";
	}

}
