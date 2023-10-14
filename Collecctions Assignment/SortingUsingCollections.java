package collectionLearning;

import java.util.*;

public class SortingUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		List<String> sorting = new ArrayList<String>();
		sorting.add("HCL");
		sorting.add("Wipro");
		sorting.add("Aspire Systems");
		sorting.add("CTS");
		
		// get the length of the array		
		System.out.println(sorting.size());

		// sort the array		
		Collections.sort(sorting);

		// Iterate it in the reverse order
		Collections.reverse(sorting);
		// print the array
			System.out.println(sorting);
		// Required Output: Wipro, HCL , CTS, Aspire Systems

	}

}
