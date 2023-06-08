package com.example.testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Day9_1 {
	Calculatordemo obj=new Calculatordemo();
  @Test(dataProvider="testData1")
  public void addMethod(int num1,int num2,int sum) {
	  int result=obj.add(num1, num2);
	  Assert.assertEquals(sum, result);
	  
	  
  }
  @Test(dataProvider="testData2")
  public void subMethod(int num1,int num2,int dif) {
	  int result=obj.subtract(num1, num2);
	  Assert.assertEquals(dif, result);
	  
	  
  }
  @Test(dataProvider="testData3")
  public void multiplyMethod(int num1,int num2,int prod) {
	  int result=obj.multiply(num1, num2);
	  Assert.assertEquals(prod, result);
	  
	  
  }
  @Test(dataProvider="testData4")
  public void divide(int num1,int num2,int quo) {
	  int result=obj.divide(num1, num2);
	  Assert.assertEquals(quo, result);
	  
	  
  }
  @DataProvider(name="testData1")
  public Object[][] testData1()
  {
	  return new Object[][]
			  {
		  {2,1,3},{6,1,7}
			  };
  }
  @DataProvider(name="testData2")
  public Object[][] testData2()
  {
	  return new Object[][]
			  {
		  {2,1,1},{6,3,3}
			  };
  }
  @DataProvider(name="testData3")
  public Object[][] testData3()
  {
	  return new Object[][]
			  {
		  {2,1,2},{4,2,8}
			  };
  }
  @DataProvider(name="testData4")
  public Object[][] testData4()
  {
	  return new Object[][]
			  {
		  {2,1,2},{4,2,2}
			  };
  }
}