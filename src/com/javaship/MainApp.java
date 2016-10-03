package com.javaship;

public class MainApp {

	public static void main(String[] args) {
		
		//create doctor object for methods to interact with
		Doctor d = new Doctor();
		d.treatPatient();
		
		FamilyDoctor f = new FamilyDoctor();
		f.giveAdvice();
	

	}

}
