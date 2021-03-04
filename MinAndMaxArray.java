import java.util.Scanner;

/*@Author Tobechi Onwenu
 * 
 * Get multiple array scanner inputs then print the minimum and maximum numbers
 * 
 * 
 */
public class MinAndMaxArray {
	private static Scanner scanner = new Scanner(System.in); // scanner method for inputs

	public static void main(String[] args) {
		System.out.println("Enter count: ");
		int count = scanner.nextInt();
		scanner.nextLine();

		int[] returnedArray = readIntegers(count);
		int returnedMin = findMin(returnedArray);
		int returnedMax = findMax(returnedArray);

		System.out.println("min = " + returnedMin);
		System.out.println("max = " + returnedMax);


	}

	private static int[] readIntegers(int count) // method to get the multiple scanner input array data using a
													// parameter called count
	{
		int[] array = new int[count]; // first create a new array object using the int parameter count
		for (int i = 0; i < array.length; i++) // write a for loop to get all values entered into console for the array
		{
			System.out.println("Enter a number: ");
			int input = scanner.nextInt(); // import scanner method
			scanner.nextLine(); // continue with scanner input
			array[i] = input; // put all scanner input into array at i
		}
		return array; // return method back
	}

	private static int findMin(int[] array) {
		int min = array[0];
		
//******* OR **********
		
//		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			if (value < min) {
				min = value;
			}
		}

		return min;
	}
	private static int findMax(int[] array) {
//		int max = array[0];
		
//****** OR *********
		
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			int value = array[i];
			if (value > max) {
				max = value;
			}
		}

		return max;
	}

}