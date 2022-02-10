package Test.QA;
import java.io.*;

class Test123 {

	static void Rearrange(int arr[], int n)

	{
		int j = 0, temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		
		
			for (int i = 0; i < n; i++)
			{		System.out.print(arr[i] + " ");
		}
		
	}


	public static void main(String args[])
	{
		int arr[] = { 5,3,-3,-4,0,2,-1,4,-7,2};
		int n = arr.length;

		Rearrange(arr, n);

	}
}

