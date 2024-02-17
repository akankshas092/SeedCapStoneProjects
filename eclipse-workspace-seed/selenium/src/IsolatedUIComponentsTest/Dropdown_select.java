package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Select courses=new Select(driver.findElement(By.id("testingDropdown")));
		courses.selectByIndex(1);
		Thread.sleep(500);
		courses.selectByValue("Performance");
		Thread.sleep(500);
		

	}

}

