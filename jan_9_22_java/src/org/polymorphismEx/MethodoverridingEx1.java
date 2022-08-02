package org.polymorphismEx;
 
 class Parent1 {
	 public int addition (int a, int b) {
		 return a+b;
	 }
	 public int subtraction (int a, int b) {
		 return a-b;
	 }
 }
public class MethodoverridingEx1 extends Parent1{
	public int addition (int a, int b) {
		 return a+b;
	 }
	 public int subtraction (int a, int b) {
		 return a-b;
	 }
	public static void main(String[] args) {
		MethodoverridingEx1 obj = new MethodoverridingEx1 ();
		obj.addition(10,20);
		obj.subtraction(10,20);
       
	}

}
