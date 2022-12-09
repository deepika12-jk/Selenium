package oraclejdbc.org;

public class LogicalProgram {
	
	public static void main(String[] args) {
		//Sum of Digits
		
		int a=7550557;
		int r=0;
		int temp=a;
		int count=0;
		int sum =0;
		while(a>0) {
			int b=a/10;
			int c=a%10;
			r=c+(r*10);
			a=b;
			count++;
			sum=sum+a;
		}
		System.out.println(r);
		if(temp==r) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not palindrome number");
		}
		System.out.println("No of Digits is "+count);
		System.out.println("Sum og Digits is "+sum);
	}

}
