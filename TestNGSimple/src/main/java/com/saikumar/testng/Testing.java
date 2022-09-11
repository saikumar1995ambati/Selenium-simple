package com.saikumar.testng;

import org.testng.annotations.Test;

public class Testing {
	
	@Test(enabled=false)
	public static void m1()
	{
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.out.println("method 1");
	}
	
	@Test(groups = "bonding" )
	public static void m2()
	{
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.out.println("method 2");
	}
	@Test
	public static void m3()
	{
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.out.println("method 3");
	}

	@Test(groups = "bonding")
	public static void m4()
	{
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.out.println("method 4");
	}
	@Test
	public static void m5()
	{
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		System.out.println("method 5");
	}
}
