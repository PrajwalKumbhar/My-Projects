package org.method;

public class TypeCastReturnType {
	public byte additionByte () {
		byte a=10, b=20;
		return (byte) (a+b);    

	}
	public short additionShort () {
		byte a=10, b=20;
		return (byte) (a+b);    
	}

	public static void main(String[] args) {
		System.out.println("**     Program Starts    **");

		TypeCastReturnType obj = new TypeCastReturnType ();
		System.out.println( obj.additionByte() );
        System.out.println("sum = "+ obj.additionShort() );
        System.out.println("sum = "+ obj.additionfloat() );
        
        System.out.println("**     Program Ends    **");
        return;
    }
	public double additionfloat () {
		double a=10.44f, b=20;
		return a+b;    
	}
	public int division  () {
		double a=10.45;
		int b=2;
		int div = (int)a/b;
		return 1;    
	}
	public long division2  () {
		float a=10;
		double b=2;
		long div = (long) (a/b);
		return div;    
	}
}