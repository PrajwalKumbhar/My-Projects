package org.InterviewQ;

public class ReverseNoEx {

	public static void main(String[] args) {
             int i=1234;
             int reverse=0;
             for (int a=i; a!=0; a=a/10) {
            	 int m=a%10;
            	 reverse=reverse*10+m;    //formula of reverse no
            	 
             }
             System.out.println("Reverse no of i= "+reverse);
	}

}
