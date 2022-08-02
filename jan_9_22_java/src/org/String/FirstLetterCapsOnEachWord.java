package org.String;

public class FirstLetterCapsOnEachWord {

	public static void main(String[] args) {
	    String str = "there is garden and it is beutiful";
		String [] ar = str.split(" ");
		System.out.println("no of words : "+ar.length);
		System.out.println("***********");
		for (int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println(" ********** ");
//		String a1 = ar[0].substring(0,1);
//		String a2 = a1.toUpperCase();
//		String a3 = ar[0].substring(1,5);
//		String a4 = a2.concat(a3);
//		System.out.println(a2.concat(a3));
//		System.out.println(a2.concat(ar[0].substring(1,5)));
//		System.out.println(a1.toUpperCase().concat(ar[0].substring(1,5)));
		
	//	System.out.println(ar[0].substring(0,1).toUpperCase().concat(ar[0].substring(1,5)));
		String str2 ="";
		for (int i=0; i<ar.length;i++) 
		{
			System.out.println(ar[i].substring(0,1).toUpperCase().concat(ar[i].substring(1,ar[i].length())));
			str2 = str2+" "+ar[i].substring(0,1).toUpperCase().concat(ar[i].substring(1,ar[i].length()));
		}
		str2 = str2.trim();
		System.out.println(str2);
		}
}
