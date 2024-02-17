package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta_loginself {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.google.com/");
	WebElement search=driver.findElement(By.id("APjFqb"));
	search.sendKeys("Instagram"+Keys.ENTER);
	WebElement partiallink=driver.findElement(By.partialLinkText("Instagram"));
	partiallink.click();
}}
