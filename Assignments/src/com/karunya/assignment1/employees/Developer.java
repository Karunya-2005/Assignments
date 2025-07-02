package com.karunya.assignment1.employees;

public class Developer extends Employee {
	 private String primaryLanguage;
	 public Developer(String name, String employeeId, double salary, String
			 primaryLanguage) {
			 super(name, employeeId, salary);
			 this.primaryLanguage = primaryLanguage;
			 }
	 public String getPrimaryLanguage() {
		 return primaryLanguage;
		 }
		 public void setPrimaryLanguage(String primaryLanguage) {
		 this.primaryLanguage = primaryLanguage;
		 }
		 @Override
		 public String toString() {
		 return super.toString() + String.format(" [Developer: %s]",
		 primaryLanguage);
		 }
		  

}
