package String;

public class StringBufferInfo {

	public static void main(String[] args) {
		String name ="Nitish";
		name.concat(" Kumar");
		
		//System.out.println(name);
		
		StringBuffer name1 = new StringBuffer("Nitish");
		//name1.append(" Kumar");
		
		//name1.insert(6,"Kumar");
		
		//name1.replace(1, 3, "Rohit");
		//name1.delete(0, 2);
		name1.reverse();
		System.out.println(name1);
		
		

	}

}
