package com.prodapt.codeBasedAssignment;

public class SchoolRecords {
	
	String school_Name [] = new String [10];
	int school_Id [] = new int [10];
	String school_Address[] = new String [10];
	public int i=0;
	
	void addRecords(String school, int id,String address) {
		school_Name [i] = school;
		school_Id [i] = id;
		school_Address [i] = address;
		System.out.println("School is successfully added\n");
		i++;
	}
	
	void displayRecords() {
		--i;
		for(int j=0;j<=i;j++) {
			System.out.println((j+1)+". School Name is :"+school_Name[j]+", School ID : "+school_Id[j]+" and Address is  "+school_Address[j]+"\n");
		}
	}
	
}
