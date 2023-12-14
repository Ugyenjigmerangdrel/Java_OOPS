package StudentSort;
import java.util.*;
public class Student implements Comparable<Student>{
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int compareTo(Student stu2) {
		return Integer.compare(this.age, stu2.age);
	}
	
	public String toString() {
		return(name+" = "+age);
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList();
		
		students.add(new Student("Ugyen", 18));
		students.add(new Student("UgyeJ", 23));
		students.add(new Student("UR", 18));
		
		//Collections.sort(students);
		Collections.sort(students, new AgeSort());
		
		System.out.println(students);
	}
}
