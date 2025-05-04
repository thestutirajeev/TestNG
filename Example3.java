package com.testngsamples.Samples;

import org.testng.SkipException;
import org.testng.annotations.Test;


//How to Skip TestNG Test
public class Example3 {

	@Test
	public void aSkipTest() {
		
		String condition="Welcome";
		
		if(condition.equals("Welcome")) {
			throw new SkipException("Skipping-This is not ready for testing "); 
		}
		else {
			System.out.println("Inside else condition");
		}
		
		System.out.println("Out of the if else condition");
	}
	
	@Test
	public void nonSkipTest() {
		System.out.println("No need to skip this test");
	}
}
