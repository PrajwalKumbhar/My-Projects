package org.String;

public class Ex5 {

	public static void main(String[] args) {
	    String str = "There is garden and it is beutiful";
		System.out.println("***********");
		System.out.println(str.substring(3));
		System.out.println(str.substring(10,14));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace('e', 'Q'));
		System.out.println(str.replace("is", "AAAA"));
		System.out.println(str.replaceFirst("a", "RRR"));
		System.out.println(str.replaceFirst("is", "AAAA"));
		System.out.println(str.replaceAll("is", "AAAA"));

		}
	

}
