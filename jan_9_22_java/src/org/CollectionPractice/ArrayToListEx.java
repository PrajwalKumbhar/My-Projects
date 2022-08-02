package org.CollectionPractice;

import java.util.Arrays;
import java.util.List;

public class ArrayToListEx {

	public static void main(String[] args) {
	//	Integer [] ar1 = { 44,12,22}; 
		int [] ar1 = {44,12,22};
		Integer [] x = {
				new Integer (ar1 [0]),
				new Integer (ar1 [1]),
				new Integer (ar1 [2])
					};
		List<Integer> ar = Arrays.asList(x);
	//	System.out.println(ar);
		System.out.println(ar.size());
		for (Object O : ar) {
			System.out.println(0);
		}
		
		
		
	}

}
