package OOPS;

public class ChildAddition extends addition{

	public static void main(String[] args) {
		addition add = new addition();
		add.addVlues(22, 22);
		add.addVlues(32,33, 34);
		
		double d=add.addVlues(33.33, 21.57);
		System.out.println(d);

	}

}
