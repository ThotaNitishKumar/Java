package ExceptionHandling;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		try {
			System.out.println("First try block");
			
			String text = "nITISH";
			System.out.println(text.length());
			
			try {
				
				System.out.println("Second Try Block");
				
				int value = 100/0;
				
				try {
					System.out.println("Third Try block");
					
				
					int[] array = new int[3];
					array[5]=100;
				}catch (Exception e) {
					System.out.println("End of Third try Blok");
					e.printStackTrace();
				}
				
			} catch (Exception e) {
				System.out.println("End of Second Try Block");
				e.printStackTrace();
			}
			
		}catch (Exception e) {
		    System.out.println("End of First Try Block");
		    e.printStackTrace();
		}

	}

}
