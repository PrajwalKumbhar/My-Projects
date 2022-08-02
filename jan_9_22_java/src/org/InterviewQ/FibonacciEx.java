package org.InterviewQ;

public class FibonacciEx {


	public static void main(String[] args) {
		
		   int n1=0;
		   int n2=1;
		   int n3=0;
		   System.out.print(n1+" "+n2+" ");
		   for (int a=2; a<10; a++) {
			   n3=n1+n2;
			   System.out.print(n3+" ");
			   n1=n2;
			   n2=n3;
			   
		   }
		
	}

}
