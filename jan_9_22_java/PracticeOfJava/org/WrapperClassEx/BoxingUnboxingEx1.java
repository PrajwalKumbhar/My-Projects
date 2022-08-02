package org.WrapperClassEx;

public class BoxingUnboxingEx1 {

	public static void main(String[] args) {
       float f1 = 10.11f;
       Float fobj1 = new Float (f1);       // explicit boxing
       Float fobj3 = f1;                  //  implicit boxing
       System.out.println("f1 = "+f1);
       System.out.println("fobj1 = "+fobj1);
       System.out.println("*****************");
       Float fobj2 = new Float (f1);     // explicit boxing
       float f2 = fobj2.floatValue();    // explicit Unboxing
       float f3 = fobj2;                 // implicit Unboxing
       System.out.println("fobj2 = "+fobj2);
       System.out.println("f2 = "+f2);
       
       
       Integer iobj = new Integer (10);     // explicit boxing
       Integer iobj2 = 10;                  //  implicit boxing
       int i = iobj.intValue();             // explicit Unboxing
       int i2 = iobj;
    		   
	}

}
