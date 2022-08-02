package org.String;

public class Ex4 {

	public static void main(String[] args) {
	    String str = "There is garden and it is beutiful";
	    System.out.println(str.length());
		System.out.println("***********");
		System.out.println(str.indexOf("is ga"));
		System.out.println(str.lastIndexOf("is"));
		System.out.println(str);
		str = str+ " in Pune.";  // way 1
		str = str.concat(" in Mumbai.");
		System.out.println(str);
		System.out.println(str.startsWith("There is"));
		System.out.println(str.endsWith("in Mumbai."));
		

		}
	

}
