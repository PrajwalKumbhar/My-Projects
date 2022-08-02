package org.InterviewQ;

public class SwapingOfTwoNo {
	
	   void Method1 () {    // using 3rd variables
		   int a=20;
		   int b=30;
		   System.out.println("Before Swapping");
		   System.out.println("a="+a);
		   System.out.println("b="+b);
		   int temp=a+b;
		   a=temp-a;
		   b=temp-a;
		   System.out.println("After Swapping");
		   System.out.println("a="+a);
		   System.out.println("b="+b);
	   }
	      void Method2 () {     // without using 3rd variables
	    	  int a=20;
	    	  int b=30;
	    	   System.out.println("Before Swapping");
			   System.out.println("a="+a);
			   System.out.println("b="+b);
               a=a+b;
               b=a-b;
               a=a-b;
               System.out.println("After Swapping");
    		   System.out.println("a="+a);
    		   System.out.println("b="+b);
	      }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapingOfTwoNo obj = new SwapingOfTwoNo ();
		obj.Method1();
		obj.Method2();
	}

}
