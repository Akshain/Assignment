package com.prodapt.codeBasedAssignment2;

public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR_Manager hm = new HR_Manager("Akshai N", 20, "Developer");
		HR_Manager hm1 = new HR_Manager("Prudhvi", 22, "Sn.Developer");
		HR_Manager hm2 = new HR_Manager("Akshay A", 20, "Tester");
		HR_Manager hm3 = new HR_Manager("Manoj", 21, "Web Developer");
		HR_Manager hm4 = new HR_Manager("Akhila", 21, "Data Analyst");
		
		hm.process_Records(hm);
		hm.process_Records(hm1);
		hm.process_Records(hm2);
		hm.process_Records(hm3);
		hm.process_Records(hm4);
	}

}
