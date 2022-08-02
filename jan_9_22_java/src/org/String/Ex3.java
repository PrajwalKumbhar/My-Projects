package org.String;

public class Ex3 {

	public static void main(String[] args) {
	    String str = "   There is garden and it is beutiful   ";
	    str = str.trim();
	    System.out.println(str.length());
	//	for(int i=0; i<str.length();i++) {
		//	System.out.println("charAt ("+i+") = "+str.charAt(i));
	//	}
		System.out.println("***********");
		System.out.println("'g' : "+str.indexOf('g'));
		System.out.println("'e' : "+str.indexOf('e'));
		System.out.println("last e' : "+str.lastIndexOf('e'));
	//	System.out.println("lenth of string  = "+str.length());
		Ex3 obj = new Ex3 ();
	//	obj.test (10,"Pune");
		int x=10;
		obj.test (x, str);
		}
	public void test (int a, String str1) {
		System.out.println(a);
		System.out.println(str1);
	}

}
