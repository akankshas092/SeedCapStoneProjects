package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DS24_Implicitwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement enablebtn=driver.findElement(By.id("enableAfter"));
		//enablebtn.click
		System.out.println("msg ;"+enablebtn.getText());

		//for visibl btn
		WebElement visiblbtn=driver.findElement(By.id("visibleAfter"));
		System.out.println("msg ;"+visiblbtn.getText());
		driver.close();

	}

}
