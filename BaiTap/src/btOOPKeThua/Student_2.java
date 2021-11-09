package btOOPKeThua;

import java.util.Scanner;

public class Student_2 extends Person_2 {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String studentID;
	private int academic_year;
	private float gpa;
	private float social_activities;

	public Student_2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student_2(String studentID, int academic_year, float gpa, int social_activities, String name, char gender,
			int birth_year) {
		super(name, gender, birth_year);
		this.studentID = studentID;
		this.academic_year = academic_year;
		this.gpa = gpa;
		this.social_activities = social_activities;
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

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public float getSocial_activities() {
		return social_activities;
	}

	public void setSocial_activities(float social_activities) {
		this.social_activities = social_activities;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return studentID + "," + getName() + "," + getGender() + "," + getBirth_year() + "," + academic_year + "," + gpa
				+ "," + social_activities;
	}

	void inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("studentID= ");
		studentID = sc.nextLine();
		inputPerson();
		System.out.print("academic year= ");
		academic_year = sc.nextInt();
		System.out.print("gpa= ");
		gpa = sc.nextFloat();
		System.out.print("social activities= ");
		social_activities = sc.nextFloat();
		System.out.println();
	}

	void outputStudent() {
		System.out.println("Student ID: " + getStudentID());
		outPerson();
		System.out.println("Academic year: " + getAcademic_year());
		System.out.println("GPA: " + getGpa());
		System.out.println("Social activities: " + getSocial_activities());
		System.out.println();
	}

}
