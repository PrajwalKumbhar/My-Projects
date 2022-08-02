package org.UpcastingDowncasting;

 class AA {
	 public void test1() {
		 System.out.println(" Test 1 - A");
	 }
 }
 class BB extends AA {
	 public void test1() {
		 System.out.println(" Hello ");
		 System.out.println(" Test 1 - B");
	 }
 }
 class CC extends BB {
	 public void test1() {
		 System.out.println(" Hi, Good Morning! ");
		 System.out.println(" Test 1 - C");
	 }
 }
   public class UpcastingEx2 {
	   
	public static void main(String[] args) {
	CC c1 = new CC ();
	c1.test1();
	BB b1= (BB)c1;
	b1.test1();     // child class CC method
	AA a1 = (AA)b1;
	a1.test1();
	System.out.println(" ************ ");
	BB b2 = new BB ();
	b2.test1();
	AA a2 = new AA ();
	a2.test1();
	
	}

}
