import java.io.*;
import java.util.*;

public class ArraySorting {


	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		students[0] = new Student(240, "Gaurav");
		students[1] = new Student(129, "Sumit");
		students[2] = new Student(483, "Magaresa");

		System.out.println(Arrays.toString(students));

		Arrays.sort(students, new Comparator<Student>() {
			public int compare(Student a, Student b) {
				return a.compareTo(b);
			}
		});

		System.out.println(Arrays.toString(students));		
	
	}
}