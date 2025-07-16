package csc372;
//Benjamin Lutter CSC372 7/15/2025

public class EmployeeTest {
	public static void main (String[] args) {
		Employee test = new Employee();
		test.setFirst();
		test.setLast();
		test.setID();
		test.employeeSummary();
		
		Manager testMan = new Manager();
		testMan.setFirst();
		testMan.setLast();
		testMan.setID();
		testMan.setDept();
		testMan.employeeSummary();
	}
}
