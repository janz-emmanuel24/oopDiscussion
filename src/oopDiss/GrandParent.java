package oopDiss;

public class GrandParent extends Human {
	private String nationality;
	private int weight;
	private int height;
	
	public GrandParent() {};
	public GrandParent(String name, String sex, int yob, String nationality, int weight, int height) {
		super(name, sex, yob);
		setNationality(nationality);
		setWeight(weight);
		setHeight(height);
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
	
	
}
