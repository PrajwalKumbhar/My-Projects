package org.polymorphismEx;

public class Ex2 {

	public static void main(String[] args) {
		Ex2 obj = new Ex2 ();
		obj.sub(44.2f,60,20);
		obj.sub('A',10,50);
			
		
		 
	}
        //by change type of para
	    public int sub (float a,double b, int c) {
	    //	 a=20.0f; 
	     //    b=50;
	     //    c=30;
	    	double sub=a-b-c;
	    	System.out.println("sub= "+sub);
	    	return (int) (a-b-c);
	    	
	    }
	    public int sub (char a,byte b,short c) {
	    	return (short) (a-b-c);
	    }
}
