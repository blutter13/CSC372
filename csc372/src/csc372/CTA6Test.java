package csc372;
import java.util.*;

public class CTA6Test {
	public static void main(String[] args) {
	//Initializing students arraylist
	Student bert = new Student(100, "Bert", "123 Main Street");
	Student joe = new Student(101, "Joe", "124 Main Street");
	Student jeff = new Student(133, "Jeff", "125 Main Street");
	Student anna = new Student(207, "Anna", "204 East Street");
	ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(bert, joe, jeff, anna));
	
	
	//Sort and print
	System.out.println("-----Sorting by Name-----");
	SelectionSort.sort(students, new NameComparator());
	for(int i = 0; i < students.size(); i++) { 
		System.out.println(students.get(i).toString());
	}
	
	System.out.println("------- Sorting by Roll No ------");
	SelectionSort.sort(students, new RollnoComparator());
	for(int i = 0; i < students.size(); i++) { 
		System.out.println(students.get(i).toString());
	}
	}
}

