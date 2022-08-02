package org.method;

public class DifferntParamEx1 {
	public float test1 (byte b, float f, int i,char ch, boolean bn) {
		
		return 55.44f;
	}

	public static void main(String[] args) {
		DifferntParamEx1 obj = new DifferntParamEx1 ();
		byte result =(byte) obj.test1 ((byte)129, 10.10f, 77, (char)65, false);
	//	 byte result =(byte) 55.44f;
		System.out.println(result);
		
		
	}

}
