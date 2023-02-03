package org.tnsif.looping;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//to print 1 to n numbers
		int i=1;
		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
		//to print n to 1 numbers
		System.out.println();
		i=1;
		while(n>=i)
		{
			System.out.print(n+" ");
			n--;
		}
	}

}
