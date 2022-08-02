package org.WrapperClassEx;

public class BoxUnboxEx2 {

	public static void main(String[] args) {
      int i = 10;
      Byte bobj1 = new Byte ((byte)i);     // narrowing & Boxing
      float f1 = bobj1.floatValue();
      Float fobj1 = new Float (bobj1.floatValue());
      
      byte b1 = fobj1.byteValue();
      //***********************************************
      
      byte b5 = 10;
      Byte b5obj1 = b5;   // way 1
      Byte b5obj2 = new Byte (b5);  // way 2
      Byte b5obj3 = Byte.valueOf(b5);  // way 3
      // Above 3 types of methods are present in all wrapper class
	}

}
