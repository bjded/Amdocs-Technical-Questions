import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {

		int[] A = {-1, 2, 303, 4, 5}; // test case
		//int[] A = {1, 2, 3}; // test case
		//int[] A = {-1, -3}; // test case
		
		Arrays.sort(A); // sort array smallest to largest
		
		int smallest = 0; // variable(s)

		do // while loop to check numbers
		{
			for (int i = 0; i < A.length; i++)
			{
				if (A[i] > 0)
				{
					if (A[i+1] - (A[i]) > 1) // if increment is > 1
					{
						smallest = A[i];
						break;
					}
					else if (A[i+1] > A.length-1) // if increment is always equal
					{
						smallest = A[i] + 1;
						break;
					}
				}
			}
			smallest = smallest + 1; // if no positive numbers default to 1
		} while (smallest == 0);

		//return smallest;
		System.out.println("Answer is " + smallest);
	}
}
