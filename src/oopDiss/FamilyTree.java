package oopDiss;

public class FamilyTree {

	public static void main(String[] args) {
		GrandParent g = new GrandParent();
		Child c = new Child();
		Parent p = new Parent();
		
		String name, sex, nationality;
		int yob, weight, height;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		for (int x = 0; x < 2; x++) {
			if (x == 0) {
				System.out.println("Entering the details for GrandParent:");
			}
			System.out.println("Enter granny's name:");
			name = sc.next();
			g.setFullName(name);
			System.out.println("Enter granny's sex:");
			sex = sc.next();
			g.setSex(sex);
			System.out.println("Enter granny's yob");
			yob = sc.nextInt();
			g.setYob(yob);
			System.out.println("Enter Granny's nationality:");
			nationality = sc.next();
			g.setNationality(nationality);
			System.out.println("Enter Granny's weight:");
			weight = sc.nextInt();
			g.setWeight(weight);
			System.out.println("Enter Granny's height:");
			height = sc.nextInt();
			g.setHeight(height);
		}
		
	}

}
