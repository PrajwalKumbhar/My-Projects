package org.Practice;

import org.method.SysoutMethod;

public class EvenOrOddEx {
	
	void test1 ()  {
		System.out.println("Even no 1 to 10");
		for (int i=1;i<=10;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
	  }
	}
	  void test2 () {
		  System.out.println("odd no 10 to 50");
		  for (int a=10; a<=50; a++) {
			  if (a%2!=0) {
				  System.out.println(a);
			  }
		  }
	  }
	public static void main(String[] args) {
		 EvenOrOddEx obj = new  EvenOrOddEx ();
		 obj.test1();
		 obj.test2();

	}

}
