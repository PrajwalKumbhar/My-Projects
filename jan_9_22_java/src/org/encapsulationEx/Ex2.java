package org.encapsulationEx;

     class Parent2 {
         private  int i=10;
    	 private void test1 () {
	    System.out.println("Test 1");
    	 }
     
    	 public int test2 () {
    		 System.out.println("i = "+i);
    		 test1 ();
    		 System.out.println("Test 2");
    		 return i;
    	 }

     }
    public class Ex2 {
    	public static void main(String[] args) {
    		Parent2 obj = new Parent2 ();
    	//	System.out.println(obj.i);
    	//	obj.test1 ();
    		int i = obj.test2 ();
    		System.out.println("in Test2, Test1: i = "+i);
    		
    		
    	}
			
		}
	     