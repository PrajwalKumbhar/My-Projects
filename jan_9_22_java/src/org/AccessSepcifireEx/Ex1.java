package org.AccessSepcifireEx;

import org.AccessSepcifireEx2.DataEx2;

public class Ex1 {

	public static void main(String[] args) {
          a obj = new a ();
          System.out.println(obj.a);    // default variables
        //  System.out.println(obj.b);  // private variables ERROR
          System.out.println(obj.c);    // public
          System.out.println(obj.d);    // protected

          DataEx1 obj2 = new DataEx1 ();
          System.out.println(obj2.a);    // default variables
          //  System.out.println(obj2.b);  // private variables ERROR
            System.out.println(obj2.c);    // public
            System.out.println(obj2.d);    // protected
          
           DataEx2 obj3 = new DataEx2 ();     
	}
}
    class a {
    	int a=10;    // defult access sepcifire
    	private int b=20;
    	public int c=30;
    	protected int d=40;
    	
    			
    }
