package oopDiss;

public class Child extends Human {
	private String name;
	private String sex;
	private int yob;
	
	public Child() {};
	public Child(String name, String sex, int yob) {
		super(name, sex, yob);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
