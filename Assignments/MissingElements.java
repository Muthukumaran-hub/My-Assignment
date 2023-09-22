package Assignments;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		
		// Sort the array	
		Arrays.sort(arr);
		
		System.out.print("The Missing Element is ");
		// loop through the array (start i from arr[0] till the length of the array)
		
		for (int i = 0; i < arr.length; i++) {
		
			int j=i+1;
			// check if the iterator variable is not equal to the array values respectively
			
			if(arr[i]!=j) {
				// print the number
			
				System.out.print(j);
				
				// once printed break the iteration
				break;
			}
		}
	





	}

}
