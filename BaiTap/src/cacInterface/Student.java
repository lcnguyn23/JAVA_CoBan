package cacInterface;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Student implements Cloneable, Comparable<Student>, Serializable {
	private static final long serialVersionUID = 1L;
	private String fullname;
	private String birthday;
	private String gender;
	private double gpa;
	private int social_activities;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String fullname, String birthday, String gender, double gpa, int social_activities) {
		super();
		this.fullname = fullname;
		this.birthday = birthday;
		this.gender = gender;
		this.gpa = gpa;
		this.social_activities = social_activities;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getSocial_activities() {
		return social_activities;
	}

	public void setSocial_activities(int social_activities) {
		this.social_activities = social_activities;
	}

	@Override
	public String toString() {
		return "Student [fullname=" + fullname + ", birthday=" + birthday + ", gender=" + gender + ", gpa=" + gpa
				+ ", social_activities=" + social_activities + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (gpa == o.gpa || social_activities == o.social_activities) {
			return 0;
		} else if (gpa > o.gpa || (gpa == o.gpa && social_activities > o.social_activities)) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.setFullname("Nguyễn Xuân Tân Lộc");
		s.setBirthday("23/08/2002");
		s.setGender("Nam");
		s.setGpa(3.2);
		s.setSocial_activities(4);

		Student s2 = new Student();
		s2.setFullname("Nguyễn Lộc");
		s2.setBirthday("23/11/2002");
		s2.setGender("Nam");
		s2.setGpa(3.0);
		s2.setSocial_activities(5);
		// Clone
		try {
			Student s1 = (Student) s.clone();
			System.out.println(s1.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(s.toString());
		}
		// Compare
		System.out.print(s.compareTo(s2));

		try (FileInputStream fos = new FileInputStream("D:/studentinfor.txt");
				ObjectInputStream oos = new ObjectInputStream(fos);) {
			s = (Student) oos.readObject();
			s2 = (Student) oos.readObject();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.err.println(s.getFullname());
	}
}
