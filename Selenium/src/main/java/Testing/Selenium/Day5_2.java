package Testing.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String url="https://j2store.net/free/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		String newurl="https://j2store.net/free/";
		if(driver.getCurrentUrl().equals(newurl))
		{
			System.out.println("Valid url");
		}
		else
		{
			System.out.println("Invalid url");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
		Thread.sleep(1000);
		String curl="https://j2store.net/free/index.php/shop?filter_catid=11";
		if(driver.getCurrentUrl().equals(curl))
		{
			System.out.println("Valid url");
		}
		else
		{
			System.out.println("Invalid url");
		}
		Thread.sleep(1000);
		driver.quit();

	}

};
