
package com.example.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_1 {
  @Test
  public void verifyTitle() throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  driver.manage().window().maximize();
	  String actualTitle=driver.getTitle();
	  //System.out.println(actualTitle);
	  Assert.assertEquals(actualTitle,driver.getTitle());
	  }
  }