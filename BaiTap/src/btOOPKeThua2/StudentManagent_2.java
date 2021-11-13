package btOOPKeThua2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManagent_2 {
	private Student_2 studentList[];
	private final static String fileName = "D:\\StudentManagement.txt";
	static ArrayList<Student_2> arr = new ArrayList<Student_2>();

	public StudentManagent_2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentManagent_2(Student_2[] studentList) {
		super();
		this.studentList = studentList;
	}

	public Student_2[] getStudentList() {
		return studentList;
	}

	public void setStudentList(Student_2[] studentList) {
		this.studentList = studentList;
	}

	public static String getFilename() {
		return fileName;
	}

	void inputStudentList(int size) {
		studentList = new Student_2[size];
		for (int i = 0; i < size; i++) {
			studentList[i] = new Student_2();
			getStudentList()[i].inputStudent();
			arr.add(studentList[i]);
		}
	}

	void outputStudentList(int n) throws IOException {
		for (int i = 0; i < n; i++) {
			getStudentList()[i].outputStudent();
		}
	}

	void sort_Student() throws CloneNotSupportedException {
		for (int i = 0; i < getStudentList().length - 1; i++) {
			for (int j = i + 1; j < getStudentList().length; j++) {
				if (getStudentList()[i].getSocial_activities() < getStudentList()[j].getSocial_activities()) {
					Student_2 temp = (Student_2) getStudentList()[i].clone();
					getStudentList()[i] = (Student_2) getStudentList()[j].clone();
					getStudentList()[j] = (Student_2) temp.clone();
				}
			}
		}
		System.out.println("Social activies order by DESC: \n");
		for (int i = 0; i < getStudentList().length; i++) {
			System.out.println("- Student " + getStudentList()[i].getStudentID() + "\n");
			getStudentList()[i].outputStudent();
		}
	}

	public void writeFiles(int size) {
		File file = new File(fileName);
		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			@SuppressWarnings("resource")
			ObjectOutputStream oos = new ObjectOutputStream(outputStream);
			for (int i = 0; i < studentList.length; i++) {
				oos.writeObject(getStudentList()[i]);
			}
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<Student_2> readFiles(int size) {
		ArrayList<Student_2> studentList = new ArrayList<Student_2>();
		try {
			FileInputStream f = new FileInputStream(fileName);
			ObjectInputStream o = new ObjectInputStream(f);
			Student_2[] students = new Student_2[size];
			for (int i = 0; i < size; i++) {
				students[i] = (Student_2) o.readObject();
				studentList.add(students[i]);
			}
			o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return studentList;

	}

	@Override
	public String toString() {
		return "StudentManagent_2 [studentList=" + Arrays.toString(studentList) + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException, IOException {
		// TODO Auto-generated method stub
		StudentManagent_2 sm = new StudentManagent_2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers of student: ");
		int n = sc.nextInt();
		sm.inputStudentList(n);
		System.out.println("Information of student: ");
		sm.outputStudentList(n);
		// System.out.println("")
		sm.sort_Student();
		sm.writeFiles(n);
		System.out.println("Read files to array list: ");
		ArrayList<Student_2> studentArrayList = sm.readFiles(n);
		for (int i = 0; i < studentArrayList.size(); i++) {
			System.out.println(studentArrayList.get(i));
		}
		sc.close();
	}
}
