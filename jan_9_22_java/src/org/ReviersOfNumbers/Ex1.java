package org.ReviersOfNumbers;

public class Ex1 {

	public static void main(String[] args) {
        int num = 7654, rem=0,sum=0;
        int temp =num;
        while (temp > 0) {
        
        	rem = temp%10;
        	sum = sum*10+rem;
        	temp = temp/10;
        }
        System.out.println("reverse = "+sum);
        
        	
	}

}
