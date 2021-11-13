package btOOPKeThua1;

import java.util.Scanner;

public class Student_1 extends Person_1 {
	private String studentID;
	private int academic_year;

	public Student_1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student_1(String studentID, int academic_year, String name, char gender, int birth_year) {
		super(name, gender, birth_year);
		this.studentID = studentID;
		this.academic_year = academic_year;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getAcademic_year() {
		return academic_year;
	}

	public void setAcademic_year(int academic_year) {
		this.academic_year = academic_year;
	}

	@Override
	public String toString() {
		return "Student_1 [studentID=" + studentID + ", academic_year=" + academic_year + "]";
	}

	void inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("studentID= ");
		studentID = sc.nextLine();
		inputPerson();
		System.out.print("academic year= ");
		academic_year = sc.nextInt();
		System.out.println();
	}

	void outputStudent() {
		System.out.println("Student ID: " + getStudentID());
		System.out.println("Academic year: " + getAcademic_year());
		outPerson();
		System.out.println();
	}

}
