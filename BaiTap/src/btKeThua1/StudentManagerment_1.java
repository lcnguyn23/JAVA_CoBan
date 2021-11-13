package btKeThua1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagerment_1 {

	private ArrayList<Student_1> studentList = new ArrayList<>();

	public StudentManagerment_1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentManagerment_1(ArrayList<Student_1> studentList) {
		super();
		this.studentList = studentList;
	}

	public ArrayList<Student_1> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student_1> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "StudentManagerment_1 [studentList=" + studentList + "]";
	}

	void inputStudentList(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Enter information of student " + (i + 1) + ": ");
			Student_1 s = new Student_1();
			s.inputStudent();
			getStudentList().add(s);
		}
	}

	void outputStudentList(int n) {
		inputStudentList(n);
		for (int i = 0; i < getStudentList().size(); i++) {
			System.out.println("\n- Student " + getStudentList().get(i).getStudentID());
			getStudentList().get(i).outputStudent();
			System.out.println();
		}
	}

	void findBirthYear(int year) {
		Vector<Object> sv = new Vector<>();
		for (int i = 0; i < getStudentList().size(); i++) {
			if (getStudentList().get(i).getBirth_year() == year) {
				sv.add("StudentId: " + getStudentList().get(i).getStudentID());
				sv.add("Name: " + getStudentList().get(i).getName());
				sv.add("Gender: " + getStudentList().get(i).getGender());
				sv.add("Birth year: " + getStudentList().get(i).getBirth_year());
				sv.add("Academic year: " + getStudentList().get(i).getAcademic_year());
			}
		}
		System.out.println(sv);
	}

	void findName(String name) {
		Vector<Object> sv = new Vector<>();
		for (int i = 0; i < getStudentList().size(); i++) {
			if (getStudentList().get(i).getName().equals(name)) {
				sv.add("StudentId: " + getStudentList().get(i).getStudentID());
				sv.add("Name: " + getStudentList().get(i).getName());
				sv.add("Gender: " + getStudentList().get(i).getGender());
				sv.add("Birth year: " + getStudentList().get(i).getBirth_year());
				sv.add("Academic year: " + getStudentList().get(i).getAcademic_year());
			}
		}
		System.out.println(sv);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManagerment_1 sm = new StudentManagerment_1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers of student: ");
		int n = sc.nextInt();
		sm.outputStudentList(n);
		System.out.print("- Find students born in: ");
		int year = sc.nextInt();
		sm.findBirthYear(year);
		sc.nextLine();
		System.out.print("- Find students named: ");
		String name = sc.nextLine();
		sm.findName(name);
		sc.close();
	}
}
