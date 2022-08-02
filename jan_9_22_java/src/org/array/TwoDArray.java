package org.array;

public class TwoDArray {

	public static void main(String[] args) {
          int [][] ar= new int[3][3];
          ar [0][0]= 40;
  	      ar [0][1]= 10;	
  	      ar [0][2]= 20;
  	      
  	      ar [1][0]= 90;
	      ar [1][1]= 80;	
	      ar [1][2]= 50;
	      
	      ar [2][0]= 60;
  	      ar [2][1]= 70;
  	      ar [2][2]= 30;
  	      System.out.println(ar.length);
  	      System.out.println("ar [1][0] ="+ar [1][0]);
  	      System.out.println("ar [2][2] ="+ar [2][2]);
          System.out.println("***************");
          for (int i=0; i<3; i++) {
          for (int j=0; j<3; j++) {
         // System.out.println("ar[i][j] ="+ar [i][j]);
          System.out.println("ar["+j+"]["+j+"]="+ar[i][j]);
          }
          }
	}

}
