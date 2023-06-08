package Testing.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url="https://demo.smart-hospital.in/site/login";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")).click();
		Thread.sleep(1000);
		driver.quit();
		

	}

}