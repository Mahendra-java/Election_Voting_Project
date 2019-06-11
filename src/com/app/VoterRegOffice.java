package com.app;

import java.util.Scanner;

public class VoterRegOffice {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
		Scanner scn = new Scanner(System.in);
		
		Voter v = new Voter();
		System.out.println("Enter Voter Name: ");
		v.setVoterName(scn.nextLine());
		System.out.println("Voter Name is: "+v.getVoterName());
		
		System.out.println("Enter Voter age: ");
		v.setAge(scn.nextInt());
		System.out.println("Voter age is: "+v.getAge());
		System.out.println("=============");
	    }
	}
}
