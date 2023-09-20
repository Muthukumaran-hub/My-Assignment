package week2.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		
		int firstN=0,secondN=1,sum=0;
		
		System.out.println("First Number is "+firstN+"\n"+"Second Number is "+secondN+"\n");
		
		System.out.println("The Fibbinocci Series");
		
		for(int i=1;i<=11;i++) {  // Iteration Level is 1 to 11
			
			sum=firstN+secondN;
			
			System.out.println(sum);
			
			firstN=secondN;
			
			secondN=sum;

		}
	}

}
/* OUTPUT
 * First Number is 0
Second Number is 1

The Fibbinocci Series
1
2
3
5
8
13
21
34
55
89
144
 */