package btOOPKeThua;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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

		try {
			FileInputStream fis = new FileInputStream(fileName);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bfr = new BufferedReader(isr);
			String line = bfr.readLine();
			while (line != null) {
				String[] array = line.split(",");
				if (array.length == 7) {
					Student_2 s = new Student_2();
					s.setStudentID(array[0]);
					s.setName(array[1]);
					s.setGender(array[2].charAt(0));
					s.setBirth_year(Integer.parseInt(array[3]));
					s.setAcademic_year(Integer.parseInt(array[4]));
					s.setGpa(Float.parseFloat(array[5]));
					s.setSocial_activities(Float.parseFloat(array[6]));
					studentArrayList.add(s);
				}

				System.out.println("File " + fileName + " in ArrayList: \n");
				for (int i = 0; i < studentArrayList.size(); i++) {
					System.out.println("ID: " + studentArrayList.get(i).getStudentID());
					System.out.println("Name: " + studentArrayList.get(i).getName());
					System.out.println("Gender: " + studentArrayList.get(i).getGender());
					System.out.println("Birth year: " + studentArrayList.get(i).getBirth_year());
					System.out.println("Academic year: " + studentArrayList.get(i).getAcademic_year());
					System.out.println("GPA: " + studentArrayList.get(i).getGpa());
					System.out.println("Social Activities: " + studentArrayList.get(i).getSocial_activities());
					System.out.println();
				}
				line = bfr.readLine();
			}
			fis.close();
			isr.close();
			bfr.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		sc.close();
	}
}
