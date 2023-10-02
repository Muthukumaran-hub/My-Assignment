package Assignments;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here is the input

		//	String "feeling good";
		String n="feeling good";

		//Convert the String to character array
		char name1[]=n.toCharArray();

		//Traverse through each character (using loop in reverse direction)
		for (int i =name1.length-1;i>=0; i--) {

			//Print the character (without newline -> 
			System.out.print(name1[i]);
		}
	}

}

