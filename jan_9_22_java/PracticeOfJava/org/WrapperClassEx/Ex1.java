package org.WrapperClassEx;

public class Ex1 {

	public static void main(String[] args) {
        int a1 = 10;
        Integer obj1 = new Integer (10);
        System.out.println("a1 = "+a1);
        System.out.println("obj1 = "+obj1);
        
        Integer obj2 = new Integer (a1);    // boxing
        System.out.println("obj2 = "+obj2);
        
        System.out.println(" **************** ");
        
        byte b1 = 50;
        Byte obj3 = new Byte (b1);
        System.out.println("b1 = "+b1);
        System.out.println("obj3 = "+obj3);
	}

}
