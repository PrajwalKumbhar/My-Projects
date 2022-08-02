package org.AbstractionEx;

   abstract class Abs4 {
	   public Abs4 () {
		   System.out.println("Defult con");
	   }
	   public void testMethod () {
		   System.out.println("Test Method");
	   }
	   abstract public int addition (int a, int b);
	   abstract public double subrtactiob (float a, float b);
   }
     public class AbsObjectEx2 {
	public static void main(String[] args) {
	//	Abs4 obj = new Abs4 ();  // ERROR
		
		Abs4 obj = new Abs4() {

			@Override
	  	public int addition(int a, int b) {
			 System.out.println("");
				return a+b;
			}

			@Override
			public double subrtactiob(float a, float b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		
		
		};
		obj.addition(10, 20);
        obj.subrtactiob(70, 20);
	}

}
