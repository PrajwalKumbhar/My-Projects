package org.narrowingWidening;

public class NarrowingEx2 {

	public static void main(String[] args) {
     long k = 120;
    // short s1 = k;    //  ERROR: implicit narrowing
     short s2 = (short) k;    // emplicit narrowing
     System.out.println("long k = "+k);
     System.out.println("short s2 = "+s2);
     float f1 = -2147483650f;
     int i = (int)f1;
     System.out.println("float f1 = "+f1);
     System.out.println("int i = "+i);
     
   
     
	}

}
