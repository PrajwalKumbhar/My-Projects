package org.Practice;

public class ReverseNoEx {

	public static void main(String[] args) {
           int a=4321;
           int reverse = 0;
           for (int i=a; a!=0; a=a/10) {
          	 int m=a%10;
          	 reverse=reverse*10+m;    //formula of reverse no
          	 
           }
           System.out.println("Reverse no of i= "+reverse);
           
           System.out.println("**********************");
           int x =987654;
           int y = 0;
           for (int i=x; x!=0; x=x/10)  {
        	   int m=x%10;
        	   reverse=reverse*10+m;
           }
           System.out.println("Reverse no of i= "+reverse);
           
	

	}

}
