package btOOPKeThua2;

import java.io.Serializable;
import java.util.Scanner;

public class Person_2 implements Cloneable, Comparable<Person_2>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private char gender;
	private int birth_year;

	public Person_2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person_2(String name, char gender, int birth_year) {
		super();
		this.name = name;
		this.gender = gender;
		this.birth_year = birth_year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Person_2 [name=" + name + ", gender=" + gender + ", birth_year=" + birth_year + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int compareTo(Person_2 o) {
		// TODO Auto-generated method stub
		if (birth_year == o.birth_year) {
			return 0;
		} else if (birth_year > o.birth_year) {
			return 1;
		} else {
			return -1;
		}
	}

	void inputPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.print("name= ");
		name = sc.nextLine();
		System.out.print("gender (m - male / f - female)= ");
		gender = sc.next().charAt(0);
		System.out.print("birth year= ");
		birth_year = sc.nextInt();
	}

	void outPerson() {
		System.out.println("Name: " + getName());
		System.out.println("Gender: " + getGender());
		System.out.println("Birth year: " + getBirth_year());
	}

	public int compareTo(Student_2 s) {
		// TODO Auto-generated method stub
		return 0;
	}

}
