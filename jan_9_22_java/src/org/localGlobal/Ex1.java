package org.localGlobal;

public class Ex1 {
      int x=10, y=20;  // global variable 
	public static void main(String[] args) {
      int a=10, b=20;  // local variable
      
        Ex1 obj=new Ex1 ();   // object name
        int sum=a+b+obj.x+obj.y;
        System.out.println("sum = "+sum);
        System.out.println("x = "+obj.x);
        System.out.println("y = "+obj.y);
        
        
        
      
      
      
	}

}
