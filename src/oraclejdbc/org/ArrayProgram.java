package oraclejdbc.org;

public class ArrayProgram {
	public static void main(String[] args) {
		
		//Arrange an array in the Ascending order
		int [] a= {7, 9, 68, 45, 599, 479, 25, 90};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
			
		}
		System.out.println("Ascending Order");
		System.out.println("---------------");
		for(int i=0; i<a.length; i++) {
		System.out.println(a[i]+"");
		
		}
		//max / min from the Array
		System.out.println();
		System.out.println(a[a.length-1]);
	
	}
	

}
