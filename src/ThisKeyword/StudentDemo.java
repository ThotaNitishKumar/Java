package ThisKeyword;

public class StudentDemo {
	
	int rollnumber;
	String name;
	String Standard;
	
	public StudentDemo(int rollnumber, String name, String Standard) {
		this.rollnumber=rollnumber;
		this.name=name;
		this.Standard=Standard;
		
	}
	public void display() {
		System.out.println("Student Roll number : "+ rollnumber+" name is : "+name+" and in class : "+ Standard);
	}

	public static void main(String[] args) {
		StudentDemo std = new StudentDemo(10, "Nitish", "10th");
		StudentDemo std2 = new StudentDemo(12, "Rohit", "3rd");
		std.display();
		std2.display();

	}

}
