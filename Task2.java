public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {3, 2, -2, 5, -3};
		//int[] A = {1, 1, 2, -1, 2, -1};
		//int[] A = {1, 2, 3, -4};
		
		int firstNum = 0;
		int secondNum = 0;
		boolean first;
		boolean second;
		int match = 0;
		
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] > 0)
			{
				first = true;
				firstNum = A[i];
			}
			else
			{
				first = false;
				firstNum = Math.abs(A[i]);
			}
			
			for (int j = 0; j < A.length; j++)
			{
				if (A[j] > 0)
				{
					second = true;
					secondNum = A[j];
				}
				else
				{
					second = false;
					secondNum = Math.abs(A[j]);
				}
				
				if (firstNum == secondNum && first != second)
				{
					if (match < firstNum)
					{
						match = firstNum;
					}
				}
			}
		}
		
		//return match;
		System.out.println(match);
	}
}
