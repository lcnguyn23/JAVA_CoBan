package cacInterface;

public class Student {
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

}
