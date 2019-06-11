package com.app;

public class Voter {
	
	private String voterName;
	private int age;
	
	public void setVoterName(String voterName){
		this.voterName=voterName;
	}
	public String getVoterName() {
		return voterName;
	}
	
	public void setAge(int age){
		if (age<18) {
			System.out.println("\nyour age is too small to vote \nYou are not eligile to caste vote");
			this.age=age;
		}else if (age>120) {
			System.out.println("\nyour age is too old to vote");
			System.out.println("You are not eligile to caste vote");
			this.age=age;
		}else {
		this.age=age;
		System.out.println("\nyou are eligible to vote");
	}}
	public int getAge() {
		return age;
		
	}

}
