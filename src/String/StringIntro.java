package String;

public class StringIntro {

	public static void main(String[] args) {
		String name = "Nitish";
		String name1 = "Nitish";
		String name3 = "nitish";
		String country = new String("India");
		String country1 = new String("India");
		/*System.out.println(name.equals(name1));
		System.out.println(name.equals(name3));
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(name == name1);
		System.out.println(country == country1);
		*/
		
		String finalstring = name  +" "  +name1+" "  +  name3;
		
		System.out.println(finalstring);
		
		String secString = name.concat(name1).concat(name3);
		System.out.println(secString);
		

	}

}
