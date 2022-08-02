package org.loopsEx;

public class Problem1 {
void Method1() {
    for (int i=1; i<=3; i++) {
   	 for (int j=3; j>=1; j--) {
   	System.out.print(j+" ");
   	 }
   	 System.out.println();
    }
    }
       void Method2 () {
    	   System.out.println("--------------------------------------");
    	   for (int i=1; i<=3; i++) {
    		   	 for (int j=1; j<=3; j++) {
    		   	System.out.print(i+" ");
    		   	 }
    		   	 System.out.println();
    		    }
       }
    	   void Method3 () {
    		   System.out.println("----------------------------------------");
    		   char c='*';
    		   for (int i=1; i<=3; i++) {
    			   for (int j=3; j>=1; j--) {
    				   System.out.print(c+ " ");
    			   }
    			   System.out.println();
    		   }		   
    	   }
             void Method4() {
      		   System.out.println("----------------------------------------");
               for (int i=11; i<=33; i=i+11) {
            	   for (int j=11; j<=33; j=j+11) {
            		   System.out.print(j+ " ");
            	   }
            	   System.out.println();
               }
             }
             void Method5() {
        		   System.out.println("----------------------------------------");
        		   for (int i=1; i<=3; i++) {
          		   	 for (int j=1; j<=i; j++) {
          		   	System.out.print(j+" ");
          		   	 }
          		   	 System.out.println();
          		    }

             }
             void Method6 () {
      		   System.out.println("----------------------------------------");

            		for(int i=1;i<=3;i++){
          			  for(int j=3;j>=i;j--){
          			    System. out. print(" ");
          			    
          			  }
          			  for(int k=1;k<=i;k++){
          			    System. out. print(k+" ");
          			  }
          			 System. out. println();
          			}
             }
            public void Method7 () {
       		   System.out.println("----------------------------------------");

            	for(int i=1;i<=4;i++){
      			  for(int j=4;j>=i;j--){
      			    System. out. print(" ");
      			  }
      			  for(int k=1;k<=i;k++){
      			    System. out. print("* ");
      			  }
      			 System. out. println();
      			}

            }
            void Method8 () {
         	   System.out.println("----------------------------------------");

           	for(int i=1;i<=4;i++){
     			  for(int j=1;j<=i;j++){
     			    System. out. print(" ");
     			  }
     			  for(int k=4;k>=i;k--){
     			    System. out. print("* ");
     			  }
     			 System. out. println();
     			}
            }

	public static void main(String[] args) {
		Problem1 obj = new Problem1 ();
		obj.Method1();
		obj.Method2();
		obj.Method3();
		obj. Method4();
		obj.Method5();
		obj.Method6();
		obj.Method7();
		obj.Method8();
	}
}
