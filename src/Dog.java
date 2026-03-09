
public class Dog {

	
		String name ="kissy";
		String breed = "Bullbog";
		int height = 4;
		String name2= "nikky";
		
		public void barking() {
			System.out.println(name + " is barking ");
		}
		public void eating() {
			System.out.println(name + " is eating");
		}
		public static void main(String[] args) {
			
			Dog dog = new Dog();
			Dog dog2 = new Dog();
			System.out.println(dog.breed);
			System.out.println(dog.height);
			System.out.println(dog.name);
			dog.barking();
			dog.eating();
			System.out.println( dog2.name2);
					
	}

}
