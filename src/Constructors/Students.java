package Constructors;

public class Students {
	
	public Students() {
		System.out.println("Hi i am inside constructor");
		System.out.println("Hi i am second method");
	}
	int rollnumber;
	String name;
	public Students(int i, String n) {
		rollnumber = i;
		name=n;
		
	}
	public void display() {
		System.out.println("Roll number is "+rollnumber + " and name is :" + name);
	}

	public static void main(String[] args) {
       Students std = new Students();
       Students std1 = new Students(10, "Nitish");
       Students std2 = new Students(11, "Rohit");
       
       std1.display();
       std2.display();
       

	}

}
