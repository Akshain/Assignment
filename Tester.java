package com.prodapt.codeBasedAssignment;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolRecords sr = new SchoolRecords();
		sr.addRecords("Jain", 123, "77 near tiruvanadhapuram");
		sr.addRecords("Global", 456, "58 gandi nagar");
		System.out.println("Display all school records");
		sr.displayRecords();
	}

}
