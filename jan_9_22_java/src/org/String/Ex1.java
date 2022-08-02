package org.String;

public class Ex1 {

	public static void main(String[] args) {
		String str1 = "Pune";
		String str2 = "Pune";
		String str3 = new String ("Pune");
		String str4 = new String ("Pune");
		
		System.out.println("str1==str2 : "+(str1==str2));
		System.out.println("str1.equals(str2) : "+str1.equals(str2));
		
		System.out.println("str3==str4 : "+(str3==str4));
		System.out.println("str3.equals(str4) : "+str3.equals(str4));


	}

}
