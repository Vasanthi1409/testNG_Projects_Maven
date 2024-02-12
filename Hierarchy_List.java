package com.testNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Hierarchy_List {
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}
	
	
}
