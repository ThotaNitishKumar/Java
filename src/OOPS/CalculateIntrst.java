package OOPS;

public class CalculateIntrst {

	public static void main(String[] args) {
		AmericanExpress am = new AmericanExpress();
		BankOfAmerica ba = new BankOfAmerica();
		ICICIBank icici = new ICICIBank();
		
		System.out.println(am.getIntrest());
		System.out.println(ba.getIntrest());
		System.out.println(icici.getIntrest());

	}

}
