package org.AbstractionEx;

abstract class Atm {
	abstract public int Deposite (int a, int b);
	abstract public int widrool(int a, int b);

 }

public class AbstractionBank {

	public static void main(String[] args) {
        Atm obj = new Atm () {
	
			public int Deposite(int a, int b) {
				System.out.println("a+b= "+(a+b));
				return a+b;
			}

	
			public int widrool(int a, int b) {
				System.out.println("a-b= "+(a-b));
				return a-b;
			}
        	
        };
        obj.Deposite(100, 50);
        obj.widrool(40, 20);
        
	}
	

}
