package com.karunya.assignment.Assignment;
 import com.karunya.assignment.employees.Manager;
 import com.karunya.assignment.employees.Developer;
 import com.karunya.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		 Manager alice = new Manager("Alice", "M001", 90000, 5);
		 Developer bob = new Developer("Bob", "D001", 80000, "Java");
		 System.out.println("=== Before changes ===");
		 EmployeeUtilities.printEmployee(alice);
		 EmployeeUtilities.printEmployee(bob);
		 EmployeeUtilities.applyRaise(alice, 10);
		 EmployeeUtilities.applyRaise(bob, 10);
		 EmployeeUtilities.bonusTeamExpansion(alice);
		 EmployeeUtilities.switchLanguage(bob, "Kotlin");
		 System.out.println("\n=== After changes ===");
		 EmployeeUtilities.printEmployee(alice);
		 EmployeeUtilities.printEmployee(bob);
	}

}
