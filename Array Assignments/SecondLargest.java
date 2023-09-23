package Assignments;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] num= {3,2,11,4,6,7};
		
		Arrays.sort(num);
		
	    System.out.println("The Second Largest Number is "+num[num.length-2]);
	}

}
