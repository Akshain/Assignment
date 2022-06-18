package com.prodapt.codeBasedAssignment2;

public abstract class Question2 {
	
	int data;
	abstract void abstractMethod();
	public Question2() {
		System.out.println("Example of super keyword \n");
	} 
	static void staticMethod() {
		System.out.println("Example of static method \n ");
	}
	final void finalMethod() {
		System.out.println("Final method cannot be overidden");
	}

}
