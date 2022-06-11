package com.prodapt.codeBasedAssignment;

public class TesterSi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest smp = new SimpleInterest();
		SimpleInterest.principle=700000;
		SimpleInterest.time=2.5;
		SimpleInterest.rateOfInterest=11.25;
		smp.calculateSI();
		SimpleInterest.time=4.8;
		smp.calculateSI();
	}

}
