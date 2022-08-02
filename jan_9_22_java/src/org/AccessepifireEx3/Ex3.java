package org.AccessepifireEx3;

import org.AccessSepcifireEx2.DataEx2;
import org.method.SysoutMethod;

public class Ex3 {

	public static void main(String[] args) {
             a obj = new a ();
             System.out.println("obj.a = "+obj.a);
           //  System.out.println("obj.b = "+obj.b);   // private 
             System.out.println("obj.c = "+obj.c);
             System.out.println("obj.d = "+obj.d);
             obj.test1();
             System.out.println("with in package");
             DataEx3 obj2 = new DataEx3 ();
             System.out.println("obj2.a = "+obj2.a);
             //  System.out.println("obj2.b = "+obj2.b);   // private 
               System.out.println("obj2.c = "+obj2.c);
               System.out.println("obj2.d = "+obj2.d);

               System.out.println("outside package");
               DataEx2 obj3 = new DataEx2 ();
           //    System.out.println("obj3.a = "+obj3.a);
               //  System.out.println("obj3.b = "+obj3.b);   // private 
                 System.out.println("obj3.c = "+obj3.c);
             //    System.out.println("obj3.d = "+obj3.d);
               
               
	}

}
  class a {
	float a=22.2f;
	private int b=50;
	 public void test1() {
		 System.out.println("test1");
	 }
	public double c=10;
	protected char d='A';
	
}
