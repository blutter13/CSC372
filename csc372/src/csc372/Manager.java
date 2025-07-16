package csc372;
import java.util.Scanner;
//Benjamin Lutter CSC372 7/15/2025 

public class Manager extends Employee {
String department;
Scanner scnr = new Scanner(System.in);

public void setDept() {
	System.out.println("Enter department:");
	department = scnr.nextLine();   	
}

public String getDept() {
	return department;   	
}
public void employeeSummary() {
	System.out.println("First Name: " + this.getFirst() + " | Last Name: " + this.getLast() + " | Employee ID: " + this.getID() + " | Salary: " + this.salary + " | Department: " + getDept());
}

}