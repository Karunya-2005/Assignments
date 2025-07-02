package com.karunya.assignment.employees;

public class Manager extends Employee {
	private int teamSize;
	 public Manager(String name, String employeeId, double salary, int
			 teamSize) {
			 super(name, employeeId, salary);
			 this.teamSize = teamSize;
			 }
	 public int getTeamSize() {
		 return teamSize;
		 }
		 public void setTeamSize(int teamSize) {
		 this.teamSize = teamSize;
		 }
		 @Override
		 public String toString() {
		 return super.toString() + String.format(" [Manager of %d people]",
		 teamSize);
		 }
		 
		 
	 

}
