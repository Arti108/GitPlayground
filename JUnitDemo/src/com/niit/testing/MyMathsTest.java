package com.niit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathsTest {
	MyMaths m=new MyMaths();
	//MyMaths.sum();
	//1,2,3=>6
	
	@Test
	public void sum_with3numbers(){
		System.out.println("Test1");
		assertEquals(6,m.sum(new int[]{1,2,3}));
	}

	
	@Test
	public void sum_with1number(){
		System.out.println("Test2");
		assertEquals(3,m.sum(new int[]{3}));
	}
		
		
		
	
}
