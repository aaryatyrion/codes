import java.io.*;
import java.util.*;

public class Student implements Comparable<Student> {

    public int marks;
    public String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student o) {
        return this.marks - o.marks;
    }
}