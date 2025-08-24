package csc372;
import java.util.*;
public class SelectionSort {
	/**
	 * Selection sort method
	 * @param students
	 * @param comparator
	 */
public static void sort(ArrayList<Student> students, Comparator<Student> comparator) {
	int len = students.size();
	for (int i = 0; i < len - 1; i++) {
		int min = i;
		for (int a = i; a < len; a++) { //Get next minimum element
			if (comparator.compare(students.get(a), students.get(min)) < 0) { 
				min = a;
			}
		}
		
		//Swap minimum element into the next lowest of the arraylist
		Student swap = students.get(min);
		students.set(min, students.get(i));
		students.set(i, swap);
	}
}
}
