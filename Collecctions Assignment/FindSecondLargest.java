package collectionLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
				//       output= 7;
				 //Create a empty Set Using TreeSet
				Set<Integer> numberSet=new TreeSet<>();
				Arrays.sort(data);
				//Declare for loop iterator from 0 to data.length and add into Set 
				for (int i = 0; i < data.length; i++) {
					numberSet.add(data[i]);
				}
				 //converted Set into List
				List<Integer> numberList=new ArrayList<>(numberSet);
			//	 Print the second last element from List
				if(numberList.size()>=2) {
					int secondLastElement=numberList.get(numberList.size()-2);
					System.out.println("Second Last Element: " +secondLastElement);
				}
				else
					System.out.println("List doesn't have a Second Last element");
				  
				  
				 

	}

}
