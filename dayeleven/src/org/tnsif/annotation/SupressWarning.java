package org.tnsif.annotation;

import java.util.Scanner;

public class SupressWarning {
       public static void main(String[] args) {
    	  @SuppressWarnings("resource") 
    	  //this annotation is used to remove the warnings at a compile time
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
	   System.out.println(x);	
	}
}