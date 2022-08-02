package org.narrowingWidening;

public class WideningEx1 {

	public static void main(String[] args) {
    byte b1 = 120;
    short s1 = b1;    // implicit widening
    short s2 = (short) b1;  // emplicit widening
    System.out.println("byte b1 = "+b1);
    System.out.println("short s1 = "+s1);
    System.out.println("short s2 = "+s2);
    float f1 = b1;
    float f2 = (float) b1;
    System.out.println("float f1 = "+f1);
    System.out.println("float f2 = "+f2);
    int i1 = b1;
    int i2 = (int)b1;
    System.out.println("int i1 = "+i1);
    System.out.println("int i2 = "+i2);
    long k1 = b1;
    long k2 = (long)b1;
    System.out.println("long k1 = "+k1);
    System.out.println("long k2 = "+k2);
        
    

    


	}

}
