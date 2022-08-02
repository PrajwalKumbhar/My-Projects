package org.array;

public class OneArrayEx {

	public static void main(String[] args) {
		float []ar = new float [4];
		ar [0]= 10.44f;
	    ar [1]= 20.77f;	
	    ar [2]= 400.94f;
	    ar [3]= -20;      // till here
	   // ar [40]= 50.44f;  // 
	 //   ar [51]= 4654; 
	    System.out.println(ar [-40]);
	  //  System.out.println("ar length : "+ar length );
	    for (int i=10; i<ar.length; i++) {
	    	System.out.println(ar [i]);
	    }
	}

}
