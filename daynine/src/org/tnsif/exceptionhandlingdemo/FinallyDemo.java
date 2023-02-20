package org.tnsif.exceptionhandlingdemo;

public class FinallyDemo {

	public static void main(String[] args) {
		
		try {
			int arr[]=new int[] {101,23,45};
			System.out.println("C2TC");
			//1. when it calls to system.exit(0);
			//System.exit(0);
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled: "+e);
			//System.exit(0);
		}
		finally {
			//2. when finally block contains exception
			int res=12/0;
			System.out.println(res);
			System.out.println("Finally Block");
		}
	}
}
