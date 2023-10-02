package Assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		

		//  Initialize an integer variable as count	 
		int count=0;

		//  Split the String into array and iterate over it 
		String[] splitWords=text.split(" ");

		for (int i = 0; i < splitWords.length; i++) {

			//  Initialize another loop to check whether the word is there in the array
			for (int j = i+1; j < splitWords.length; j++) {

				//	if it is available then increase and count by 1. 
				count+=1;
			}
		}
		if(count>1) {

			// if the count > 1 then replace the word as "" 
			String replace = text.replaceAll("[a-z]", "") ;

			//  Displaying the String without duplicate words	
			System.out.println("Without Duplicates: "+replace);
		}





	}

}
