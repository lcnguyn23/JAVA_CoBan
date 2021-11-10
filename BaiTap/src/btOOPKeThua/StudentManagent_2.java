package btOOPKeThua;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManagent_2 {
	private Student_2 studentList[];
	private final static String fileName = "D:\\StudentManagement.txt";

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

	@Override
	public String toString() {
		return "StudentManagent_2 [studentList=" + Arrays.toString(studentList) + "]";
	}

	void input(int size) {
		studentList = new Student_2[size];
		for (int i = 0; i < size; i++) {
			studentList[i] = new Student_2();
			getStudentList()[i].inputStudent();
		}
	}

	void output(int size) throws IOException {
		input(size);
		File file = new File(fileName);
		OutputStream outputStream = new FileOutputStream(file);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		for (int i = 0; i < studentList.length; i++) {
			getStudentList()[i].outputStudent();
			String data = getStudentList()[i].toString();
			outputStreamWriter.write(data);
			outputStreamWriter.write("\n");
		}
		outputStreamWriter.flush();
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

	public static void main(String[] args) throws CloneNotSupportedException, IOException {
		// TODO Auto-generated method stub
		StudentManagent_2 sm = new StudentManagent_2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers of student: ");
		int n = sc.nextInt();
		sm.output(n);
		sm.sort_Student();

		ArrayList<Student_2> studentArrayList = new ArrayList<Student_2>();

		sc.close();
	}
}
