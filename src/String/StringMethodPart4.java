package String;

public class StringMethodPart4 {

	public static void main(String[] args) {
		String text ="United States      ";
		/*System.out.println(text.substring(5));
		System.out.println(text.substring(2, 9));*/
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		/*System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		System.out.println(text.trim());*/
	}

}
