package Assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Check number of occurrences of a char (eg 'e') in a String
		String text = "welcome to chennai";

		// declare and initialize a variable count to store the number of occurrences
		int count=0;
		
		// convert the string into char array
		char letters[]=text.toCharArray();	
		
		//get the length of the array
		int arrayLength=letters.length;
		
		// traverse from 0 till the array length 
		for (int i = 0; i < arrayLength; i++) {
		
			// Check the char array has the particular char in it 
			if(letters[i]=='e') {
				// if is has increment the count
				count+=1;	
			}

		}
		
		// print the count out of the loop
		System.out.println("No.of e Occured in this sentence is: "+count);
	}

}
