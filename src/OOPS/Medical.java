package OOPS;

public class Medical implements Student {

	
	public void displayName() {
		System.out.println("Hi, We are from Medical department");
		
	}


	public void getStudentNumber() {
		System.out.println("We are 140 students ");
		
		
	}


	public void getStandard() {
		System.out.println("We are from MBBS");
		
		
	}
	public void getUniversity() {
		System.out.println("University name is St Anns");
	}
	public static void main(String[] args) {
		Engineering eng = new Engineering();
		Medical med = new Medical();
		
		eng.displayName();
		eng.getStandard();
		eng.getStudentNumber();
		eng.getUniversity();
		
		System.out.println("***********************************************");
		med.displayName();
		med.getStandard();
		med.getStudentNumber();
		med.getUniversity();
		
	}


	@Override
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}


}
