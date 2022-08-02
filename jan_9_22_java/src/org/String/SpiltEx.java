package org.String;

public class SpiltEx {

	public static void main(String[] args) {
	    String str = "There is garden and it is beutiful";
		System.out.println("***********");
	//	String [] ar = str.split("is");
		String [] ar = str.split(" ");
		System.out.println("no of words : "+ar.length);
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println(" ********** ");
		for (int i=ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
		}
	

}
