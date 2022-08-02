package org.inheritanceEx;
   
    class A4 {
    	public int a=10, b=20;
    	public void test1 () {
    		System.out.println("Test 1");
    	}
    	public void test2 () {
    		System.out.println("Test 2");
    	}
    }
       public class SuperKeywordEx extends A4 {
    	public SuperKeywordEx () {
    		System.out.println(super.a);
    		System.out.println(super.b);
    		super.test1();
    		super.test2();
    	}
	   public static void main(String[] args) {
   	//	System.out.println(super.a);  //ERROR
		   SuperKeywordEx obj = new SuperKeywordEx ();
		   obj.ChildMethod ();
	}
	   public void ChildMethod () {
		   System.out.println("* Child Method *");
		   System.out.println(super.a);
		   System.out.println(super.b);
		   super.test1();
		   super.test2();
	   }

}
