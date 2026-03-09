
public class ifCondition {

	public static void main(String[] args) {
		int a=1700;
		int b =400;
		int c= 900;
		/*if(a>b) {System.out.println("a is big");}else
		{
			
			System.out.println("b is big");
			}*/
		if (a>b && a>c) {
			System.out.println("a is big");
			
		}else if (b>c && b>a) {
			System.out.println("b is big");
		}else {
			System.out.println("C is big");
		}

	}

}
