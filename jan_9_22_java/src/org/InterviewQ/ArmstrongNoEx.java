package org.InterviewQ;

public class ArmstrongNoEx {

	public static void main(String[] args) {
           int x=153;
           int arm=0;
           for (int i=x; i!=0; i=i/10) {
        	   int m=i%10;
        	   arm=arm+m*m*m;
           }
           if (x==arm) {
        	   System.out.println(x+" is aramstrong no");
           }
           else {
        	   System.out.println(x+" is not aramstrong no");

           }
	}

}
