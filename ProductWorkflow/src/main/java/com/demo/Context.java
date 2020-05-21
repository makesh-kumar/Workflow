package com.demo;

public interface Context {
	public void setAttribute(String name, String value);
	 
	/**
	 
	* Retrieve object with specified name from context,
	 
	* if object does not exists in context it will return null.
	 
	*
	 
	* @param name of attribute which need to be returned
	 
	* @return Object from context or null if there is no value assigned to specified name
	 
	*/
	 
	public Object getAttribute(String name);
}
