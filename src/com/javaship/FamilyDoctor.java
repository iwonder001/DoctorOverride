package com.javaship;

public class FamilyDoctor extends Doctor {

	public boolean makesHouseCalls;

	public FamilyDoctor() {
		super ();
		worksAtHospital = false;
		makesHouseCalls = true;
	}
	@Override
	public void giveAdvice() {
		System.out.println("Here is some advice...");
	}
}
