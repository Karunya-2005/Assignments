package com.karunya.assignment.utilities;
import com.karunya.assignment.employees.Employee;
import com.karunya.assignment.employees.Manager;
import com.karunya.assignment.employees.Developer;

public class EmployeeUtilities {
	 public static void applyRaise(Employee emp, double percent) {
		 double current = emp.getSalary();
		 emp.setSalary(current * (1 + percent / 100));
		 }
	 public static void printEmployee(Employee emp) {
		 System.out.println(emp.toString());
		 }
	 public static void bonusTeamExpansion(Manager mgr) {
		 mgr.setTeamSize(mgr.getTeamSize() + 1);
		 }
	 public static void switchLanguage(Developer dev, String newLang) {
		 dev.setPrimaryLanguage(newLang);
		 }
}
