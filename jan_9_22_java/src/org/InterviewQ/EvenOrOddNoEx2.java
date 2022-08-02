package org.InterviewQ;

public class EvenOrOddNoEx2 {
	
	        void Method1 () {
	        	System.out.println("Even No for 1 To 100");
	        	for (int a=1; a<=100; a++) {
	        	if (a%2==0) {
	        		System.out.println(a);
	        	}
	        	}
	        }
	        void Method2 () {
	        	System.out.println("Odd No for 1 To 20");

	        	for (int x=1; x<=20; x++) {
	        		if (x%2!=0) {
	        			System.out.println(x);
	        		}
	        	}
	        }
	        
	

	public static void main(String[] args) {
		EvenOrOddNoEx2 obj = new  EvenOrOddNoEx2 ();
		obj.Method1();
        obj.Method2();
        		   
	}

}
