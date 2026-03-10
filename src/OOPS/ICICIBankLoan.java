package OOPS;

public class ICICIBankLoan extends BankLoan {
	
	public static void main(String[] args) {
		BankLoan loan = new BankLoan();
		
		loan.setName("Nitish");
		loan.setAge(20);
		loan.setAmount(10000);
		
		
		System.out.println("Name is : "+ loan.getName());
		System.out.println("Age is : " +loan.getAge());
		System.out.println("Amount is : " + loan.getAmount());
		
	}

}
