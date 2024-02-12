package com.testNG;

import org.testng.annotations.Test;

public class Priority {
	
  @Test(priority = 1)
  public void p1() {
	  System.out.println("Priority 1");
  }
 
  @Test(priority = -1)
  public void p2() {
	  System.out.println("Priority -1");
  }
  
  @Test(priority = -2)
  public void p3() {
	  System.out.println("Priority -2");
  }
  
  @Test(priority = 0)
  public void p4() {
	  System.out.println("Priority 0");
  }
  
  @Test(priority = 2)
  public void p5() {
	  System.out.println("Priority 2");
  }
 
}
