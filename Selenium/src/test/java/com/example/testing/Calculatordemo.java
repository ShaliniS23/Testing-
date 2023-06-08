package com.example.testing;
import org.testng.annotations.Test;

public class Calculatordemo {
 
  @Test(priority=1)
  
  public int add(int num1,int num2) {
	  int sum=num1+num2;
	  return sum;
	  }
  @Test(priority=4)
  public int subtract(int num1,int num2)
  {
	  int dif=num1-num2;
	  return dif;
  }
  @Test(priority=3)
  public int multiply(int num1,int num2)
  {
	  int prod=num1*num2;
	  return prod;
  }
  @Test(priority=2)
  public int divide(int num1,int num2)
  {
	  int quotient=num1/num2;
	  return quotient;
  }
}