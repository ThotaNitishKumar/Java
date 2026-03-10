package OOPS;

public class Car {
	
	public Car() {
		System.out.println("Creating Car");
		
	}
	
	public final void setWheels() {
		System.out.println("Only 4 wheels are allowed");
		
	}
	String name = "Car Segment";
	
	public void run() {
		System.out.println("Car is running");
	}

}
