
package javaprograms;

import java.util.Scanner;

public class threearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of rows");
   int rows=sc.nextInt();
   System.out.println("Enter the number of columns");
   int columns=sc.nextInt();
   System.out.println("Enter the number of blocks");
   int blocks=sc.nextInt();
   int a[][][]=new int[rows][columns][blocks];
     System.out.println("Enter the element");
      for(int i=0; i<rows; i++) {
    	  for(int j=0;j<columns;j++) {
    		  for(int k=0;k<blocks;k++) {
    			  a[i][j][k]=sc.nextInt();
    		  }
    	  
 }
      }
    	  System.out.println("Enter the element");
          for(int i=0; i<rows; i++) {
        	  for(int j=0;j<columns;j++)  {
        		  for(int k=0;k<blocks;k++) {
      System.out.println(a[i][j][k]);
      }
	}
          }
          }
}
