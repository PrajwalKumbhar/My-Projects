package org.InterviewQ;

public class PrimeNoEx {

	public static void main(String[] args) {
         int a=33;
         int count=0;
         for (int i=1; i<=a; i++) {
        	 if (a%i==0) {
        		 count++;
        	 }
         }
         if (count==2) {
        	 System.out.println(a+" is Prime No");
         }
         else {
        	 System.out.println(a+" is Not Prime No");

         }
	}

}
