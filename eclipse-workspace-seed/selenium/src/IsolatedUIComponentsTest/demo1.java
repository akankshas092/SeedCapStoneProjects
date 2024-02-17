package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("rohit sharma"+Keys.ENTER);
		
		WebElement image1=driver.findElement(By.linkText("Images"));
		image1.click();
		WebElement wiki=driver.findElement(By.partialLinkText("WiKi"));
		wiki.click();
		

	}

}
