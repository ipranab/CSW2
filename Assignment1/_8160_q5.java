class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College: " + college.getCollegeName() + " situated at " + college.getCollegeLoc());
        System.out.println();
    }
}

public class _8160_q5 {

	public static void main(String[] args) {
        College college1 = new College("ITER", "JAGAMARA");
        College college2 = new College("KIIT", "PATIA");

        Student student1 = new Student(890, "SOMUI", college1);
        Student student2 = new Student(237, "SONALI", college2);

        System.out.println("College Information:");
        System.out.println("1. " + college1.getCollegeName() + " positioned at " + college1.getCollegeLoc());
        System.out.println("2. " + college2.getCollegeName() + " positioned at " + college2.getCollegeLoc());
        System.out.println();

        System.out.println("Student Information:");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
	}

}
