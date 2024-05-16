import java.util.*;

class Student {
	private String name;
	private int age;
	private double mark;

	public Student(String name, int age, double mark) {
		this.name = name;
		this.age = age;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;
		return age == student.age && Double.compare(student.mark, mark) == 0 && name.equals(student.name);
	}
}

public class _8160_q4 {

	public static void main(String[] args) {
		LinkedList<Student> students = new LinkedList<>();
		Scanner sc = new Scanner(System.in);

		displayList(students);
		students.add(new Student("KULLU", 20, 100));
		students.add(new Student("AIDO",20,100));
		students.add(new Student("BEBOO",21,90));
		students.add(new Student("SHIV",35,94));
		
		System.out.print("Enter the name of the student to check if it exists:");
        String name = sc.nextLine();
        System.out.print("Enter the age of  student:");
        int age = sc.nextInt();
        System.out.print("Enter the mark of  student:");
        double mark = sc.nextDouble();
        Student inputStudent = new Student(name, age, mark);
		System.out.println("list contains the student(using contains): " + students.contains(inputStudent));
		System.out.println(
				"list contains the student(using reference): " + containsByReference(students, inputStudent));

		
		System.out.println("List before removal:");
		displayList(students);
		removeStudent(students, students.get(3));
		System.out.println("List after removal:");
		displayList(students);

		System.out.println("Number of students in the list: " + students.size());

		System.out.println("Are student1 and student2 equal? " + students.get(0).equals(students.get(1)));
		sc.close();	
	}

	public static void displayList(LinkedList<Student> students) {
		if(students.isEmpty()) return;
		for (Student student : students) {
			System.out.println(
					"Name: " + student.getName() + ", Age: " + student.getAge() + ", Mark: " + student.getMark());
		}
	}

	public static boolean containsByReference(LinkedList<Student> students, Student student) {
		for (Student s : students) {
			if (s == student) {
				return true;
			}
		}
		return false;
	}

	public static void removeStudent(LinkedList<Student> students, Student student) {
		students.remove(student);
	}

}
