package Array;


public class PassArrayToMethod {
	
	public static void findMin(int arrayOne[]) {
		
		int min=arrayOne[0];
		
		for(int i=1; i<arrayOne.length; i++) {
			if(min>arrayOne[i]) {
				min=arrayOne[i];
			}
		}
          
		System.out.println("Minimum Element is " + min);
	}
	public static int[] getArray() {
		
		return new int[] {12,64,4,34,1,56};
	}
	

	public static void main(String[] args) {
		
		PassArrayToMethod pass = new PassArrayToMethod();
		int arrayTest[]= {12,64,4,34,1,56};
		pass.findMin(arrayTest);
		
		int arraythree[]=pass.getArray();
		System.out.println(arraythree[2]);
		

	}

}

/*1️⃣ Package Declaration
package Array;

This line creates a package named Array.

A package is used to organize Java classes inside Eclipse IDE or any Java project.

2️⃣ Class Declaration
public class PassArrayToMethod {

This creates a class named PassArrayToMethod.

A class is a blueprint that contains methods and variables.

3️⃣ Method to Find Minimum Value
public static void findMin(int arrayOne[])
Explanation
Part	Meaning
public	accessible from anywhere
static	method belongs to class
void	method does not return a value
findMin	method name
int arrayOne[]	parameter that receives an array

This method receives an integer array as input.

Example array passed later:

[12, 64, 4, 34, 1, 56]
4️⃣ Assign First Element as Minimum
int min = arrayOne[0];

Here we assume the first element is the minimum.

So initially:

min = 12
5️⃣ Loop Through the Array
for(int i=1; i<arrayOne.length; i++)

This loop goes through the array starting from index 1.

Array indexes:

Index   Value
0       12
1       64
2       4
3       34
4       1
5       56

arrayOne.length gives the size of the array.

6️⃣ Compare Values
if(min > arrayOne[i])

This checks:

Is current min greater than the current array element?

If yes, update the minimum.

Example step-by-step:

Step	Element	Min
Start	12	12
64	12	12
4	4	4
34	4	4
1	1	1
56	1	1

Final minimum:

1
7️⃣ Print the Result
System.out.println("Minimum Element is " + min);

Output:

Minimum Element is 1
8️⃣ Main Method
public static void main(String[] args)

This is the entry point of the program.

Execution starts here.

9️⃣ Create Object of the Class
PassArrayToMethod pass = new PassArrayToMethod();

This creates an object named pass.

🔟 Create Array
int arrayTest[] = {12,64,4,34,1,56};

This array contains 6 numbers.

1️⃣1️⃣ Call the Method
pass.findMin(arrayTest);

Here we pass the array to the method.

So the method receives:

arrayOne = {12,64,4,34,1,56}

Then it finds the minimum value.

Final Output
Minimum Element is 1*/
