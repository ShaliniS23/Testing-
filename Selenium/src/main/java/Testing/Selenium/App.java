package Testing.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //launching the URL
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
       
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)","");
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Priyadharshini");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("S");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("priya@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Priya@123");
        
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        

    }
}

