package org.tnsif.looping;

import java.util.Scanner;

// to demonstrate exmaple on "for loop"
public class ForDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		// to  print i to N nos.
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		// to  print N to i nos.
		for(int i=n;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}
}
