package org.tnsif.exceptionhandlingdemo;

import java.io.IOException;

//program to demonstrate throw and throws keyword
public class ThrowKeywordDemo {
	
	//method definition
	//throws is used to declare an exception
	public static void donate(int age,int weight) throws Exception
	{
		if(age>18 && weight>50)
			System.out.println("Eligible to donate the blood");
		else
			//to throw an exception explicitly
			throw new IOException("Not eligible");
	}

	public static void main(String[] args) throws Exception{
		try 
		{
			//method call
			donate(17,55);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
