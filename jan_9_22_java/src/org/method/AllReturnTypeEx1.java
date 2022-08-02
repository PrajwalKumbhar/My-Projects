package org.method;

public class AllReturnTypeEx1 {
	
	public static void main(String[] args) {
		AllReturnTypeEx1 obj = new AllReturnTypeEx1 ();
      //   System.out.println(obj.test1 ()); // ERROR
		System.out.println(obj.test2 ());
		System.out.println(obj.test3 ());
		System.out.println(obj.test4 ());
		System.out.println(obj.test5 ());
		System.out.println(obj.test6 ());
		System.out.println(obj.test7 ());
		System.out.println(obj.test8 ());
		System.out.println(obj.test9 ());

	}
    public void test1 () {
    	System.out.println("Test1 - void");
    }
    public byte test8 () {
    	System.out.println("Test8 - byte");
    	return 110; // ERROR
    }
    public short test9 () {
    	System.out.println("Test9 - short");
    	return 2;
    }
    public int test2 () {
    	System.out.println("Test2 - int");
    	return 10;
    }
    public long test3 () {
    	System.out.println("Test3 - long");
    	return 5566;
    }
    public float test4 () {
    	System.out.println("Test4 - float");
    	return 77.22f;
    }
    public double  test5 () {
    	System.out.println("Test5 - double");
    	return 88.99d;
    }
    public char test6 () {
    	System.out.println("Test6 - char");
    	return 'R';
    }
    public boolean test7 () {
    	System.out.println("Test7 - boolean");
    	return false;
    }
}











