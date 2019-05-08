package oopDiss;

public abstract class Human {
	private String fullName;
	private String sex;
	private int yob;
	
	public Human() {};
	public Human(String fullName, String sex,int yob) {
		this.fullName = fullName;
		this.sex = sex;
		this.yob = yob;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
	
}
