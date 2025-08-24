package csc372;
import java.util.*;
public class NameComparator implements Comparator {

	public int compare(Object ob1, Object ob2) {
		Student student1=(Student)ob1;
		Student student2=(Student)ob2;
		return student1.getName().compareTo(student2.getName());
	}
}
