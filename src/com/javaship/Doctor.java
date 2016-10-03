package com.javaship;

public class Doctor {
	// the instance variable
	public boolean worksAtHospital;

	// the constructor
	public Doctor() {
		worksAtHospital = true;
	}

	// create the get method for the worksAtHospital variable
	public boolean getWorksAtHospital() {
		return worksAtHospital;
	}
	//create the set method for the worksAtHospital variable
	public void setWorksAtHospital(boolean w) {
		worksAtHospital = w;
	}
	//create method for treating patient
	public void treatPatient() {
		System.out.println("How can we treat you today?");
		
	
	}

	public void giveAdvice() {
		
		
	}
}
