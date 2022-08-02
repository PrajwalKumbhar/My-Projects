package org.interfaceEx;

   interface Interf3 {
	   public void test2 ();
   }
    public class InterfaceObj {
	public static void main(String[] args) {
	//	Interf3 obj = new Interf3 ();  // ERROR
		Interf3 obj = new Interf3 () {
			public void test2 () {
				System.out.println("Test 2");
			}
		};
		obj.test2();
            
	}

}
