
public class SwitchStatment {

	public static void main(String[] args) {
		int day=800;
		switch (day) {
		case 1:
			System.out.println("Today is monday");	
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wenserday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is friday");
		    break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
		default:
			System.out.println("There are only 7 days in a week please choose the number between 1 to 7");
			break;
		}

	}

}
