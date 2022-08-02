package org.CollectionPractice;

import java.util.ArrayList;

public class ArEx1 {

	public static void main(String[] args) {
     ArrayList ar1 = new ArrayList ();
     ar1.add(new Integer (10));
     ar1.add(new ArEx1 ());
     ar1.add(new String ("Mumbai"));
     ar1.add(new Character ('D'));
     ar1.add(-500);       // imlicit boxing
     ar1.add((short)10);    // explicit narrowing boxing
     ar1.add(new Byte ((byte)50));
     ar1.add("Pune");
     ar1.add(99.77);
     System.out.println(ar1);
	}

}
