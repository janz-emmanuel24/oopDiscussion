package oopDiss;

public class Parent extends GrandParent {
	java.util.ArrayList<Child> children;
	private String name;
	private String sex;
	private int yob;
	private String nationality;
	private int weight;
	private int height;
	
	public Parent() {}
	public Parent(String name, String sex, int yob, String nationality, int weight, int height) {
		super(name, sex, yob, nationality, weight, height);
	}

	public void setChildren(Child children) {
		this.children.add(children);
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void getChildren() {
		
	}
}
