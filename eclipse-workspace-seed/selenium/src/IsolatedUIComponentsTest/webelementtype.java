package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelementtype {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		WebElement textbox1=driver.findElement(By.id("fname"));
		textbox1.sendKeys("Testing");
		WebElement button=driver.findElement(By.id("idOfButton"));
		button.click();
		WebElement radio=driver.findElement(By.id("male"));
		radio.click();
		WebElement radio1=driver.findElement(By.id("female"));
		radio1.click();
		WebElement checkbox1=driver.findElement(By.className("Automation"));
		checkbox1.click();
		WebElement checkbox2=driver.findElement(By.className("Performance"));
		checkbox2.click();
		Select courses=new Select(driver.findElement(By.id("testingDropdown")));
		courses.selectByIndex(1);
		Thread.sleep(500);
		courses.selectByValue("")
		
		
		

	}

}
