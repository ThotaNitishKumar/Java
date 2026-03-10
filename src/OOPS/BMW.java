package OOPS;

public class BMW extends Car{
	
	public BMW() {
		//super();
		System.out.println("creating BMW");
	}
	
	static String name = "BMW ";
	
	/*public void setWheels() {
		
	}*/
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	public void run() {
		System.out.println("BMW is running");
		super.run();
	}
	
	public static void main(String[] args) {
		/*Car car =new Car();
		System.out.print(name);
		car.run();*/
		BMW bmw = new BMW();
		bmw.run();
		
	}
	

}
