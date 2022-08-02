package org.arrayEx2;


public class SelectionSortEx1 {

	public static void main(String[] args) {
          int ar[] = { 50,-10,30,00,-40 };
          System.out.println("Before Sorting");
          for (int i=0; i<ar.length; i++) {
        	  System.out.println(ar[i]);
          }
          for (int i=0; i<ar.length; i++) {
          for (int j=i+1; j<ar.length; j++) {
              if (ar [i]<ar[j]) {
              int temp = ar [i];
              ar[i] = ar[j];
              ar[j]= temp;
              }
          } 
       
         }
      //    if (i==1) {
             System.out.println(" 1st highest");
            System.out.println(ar[0]);
           //	 break;
            }
       
        }
// }