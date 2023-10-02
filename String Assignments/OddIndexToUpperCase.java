package Assignments;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare String Input as Follow
		String text = "changeme";
		
		//Convert the String to character array
		char intoLetters[]=text.toCharArray();
		System.out.println("After the Odd Index Changed into UpperCase:");
		
		//Traverse through each character (using loop)
		for (int i = 0; i < intoLetters.length; i++) {
		
			//find the odd index within the loop (use mod operator)
			if (i%2==1) {
			
				//within the loop, change the character to uppercase,
				//if the index is odd else don't change
				char uppercase=Character.toUpperCase(intoLetters[i]);
				
				System.out.print(uppercase);
			}
			else {
				System.out.print(intoLetters[i]);
			}
		}




	}

}
