package org.InterviewQ;

public class PalindromeEx {

	public static void main(String[] args) {
        int i=121;
        int reverse=0;
        for (int a=i; a!=0; a=a/10) {
       	 int m=a%10;
       	 reverse=reverse*10+m;    //formula of reverse no
       	 
        }
         if (i==reverse) {
        	 System.out.println(i+" is Palindrome");
         }
         else {
        	 System.out.println(i+" is Not Palindrome");

         }

	}

}
