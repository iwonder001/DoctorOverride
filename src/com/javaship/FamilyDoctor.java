package com.javaship;

public class FamilyDoctor extends Doctor {

	public boolean makesHouseCalls;

	public FamilyDoctor() {
		super ();
		worksAtHospital = false;
		makesHouseCalls = true;
	}
	//override Doctor class method
	@Override
	public void giveAdvice() {
		System.out.println("Here is some advice...");
	}
	//set getter for makesHouseCalls
	public boolean getMakesHouseCalls() {
		return makesHouseCalls;
	}
	//set setter
	public void setMakeHouseCalls(boolean m) {
	makesHouseCalls = m;
	}
	
}
