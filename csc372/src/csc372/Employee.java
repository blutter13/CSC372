package csc372;
import java.util.Scanner;
//Benjamin Lutter CSC372 7/15/2025
public class Employee {

    String firstName;
    String lastName;
    int employeeID;
    double salary;
	Scanner scnr = new Scanner(System.in);
	
    Employee() {
    	this.salary = 0.0;
    }
    
    public void setFirst() {
    	System.out.println("Enter first name:");
    	firstName = scnr.nextLine();   	
    }
    
    public void setLast() {
    	System.out.println("Enter last name:");
    	lastName = scnr.nextLine();
    }
    
    public void setID() {
    	System.out.println("Enter employee ID:");
    	employeeID = scnr.nextInt();
    }
    
    public String getFirst() {
    	return firstName;
    }
    
    public String getLast() {
    	return lastName;
    }
    public int getID() {
    	return employeeID;
    }
    
    public void employeeSummary() {
    	System.out.println("First Name: " + this.getFirst() + " | Last Name: " + this.getLast() + " | Employee ID: " + this.getID() + " | Salary: " + this.salary);
    }
}
