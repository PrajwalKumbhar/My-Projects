package org.ConstructorEx;

public class Ex1 {
	   int a;
	   public Ex1 () {   // defult constroctor
		   System.out.println("Defult Constructor");
		   a=10;
	   }

	public static void main(String[] args) {
         Ex1 obj = new Ex1 ();
         System.out.println("a = "+obj.a);
	}

}
