package csc372;
import java.util.*;
public class RollnoComparator implements Comparator {
	public int compare(Object ob1, Object ob2) {
		Student student1=(Student)ob1;
		Student student2=(Student)ob2;
		Integer rollno1 = student1.getRollno();
		Integer rollno2 = student2.getRollno();
		return rollno1.compareTo(rollno2);
	}
}
