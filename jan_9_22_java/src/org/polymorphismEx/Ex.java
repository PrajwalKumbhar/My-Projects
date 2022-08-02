package org.polymorphismEx;

public class Ex {

	public static void main(String[] args) {
		
		 Ex obj = new Ex();
		 obj.addition();
		 obj.addition(20);
		 obj.addition(50,60);
		 obj.addition(70,40,30);
		
	}
		 // by changing no of para
		public void addition() {
			int a=10,b=30;
			int sum = a+b;
			System.out.println("sum= "+sum);
		
		}
		public int addition (int a) {
			System.out.println("int a= "+a);
			return a;
			
		}
		public int addition (int a, int b) {
			System.out.println("int a+b= "+(a+b));
			return a+b;
		}
		public int addition (int a, int b,int c ) {
			System.out.println("int a+b+c= "+(a+b+c));
			return a+b+c;
		}
		

	}


