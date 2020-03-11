package com.niit.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	@Test
	public void MySimpleEqualsTest(){
		String expectedName="Raj";
		assertEquals(expectedName,Employee.getEmpNameWithHighestSalary());
	}
	
	
	@Test
	public void myObjectEqualsTest(){
		Employee expectedEmpObj=new Employee(1,"Raj",150000);
		assertEquals(expectedEmpObj,Employee.getHighestPaidEmployee());
	}
	
	
	

	
	

}
