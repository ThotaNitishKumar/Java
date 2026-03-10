package Array;

public class TestArray {

	public static void main(String[] args) {
		int arrayone[]= new int[10];
		arrayone[0]=12;
		arrayone[1]=13;
		arrayone[2]=14;
		arrayone[3]=15;
		arrayone[4]=16;
		arrayone[5]=17;
		arrayone[6]=18;
		arrayone[7]=19;
		
		System.out.println(arrayone[4]);
		
		for(int i=0; i<arrayone.length; i++) {
			System.out.println(arrayone[i]);
			
		}
		
		int arrayTWo[]= {10,20,30,40,50,60,70,80,90};
		
		System.out.println("Size of second array : " +arrayTWo.length);
	}

}
