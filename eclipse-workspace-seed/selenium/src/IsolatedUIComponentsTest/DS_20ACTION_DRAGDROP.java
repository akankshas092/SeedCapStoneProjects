package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DS_20ACTION_DRAGDROP {

	public static void main(String[] args) {
		//DRAG AND DROP
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/droppable/");

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/aside[1]/ul/li[2]/a")).click();
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.xpath("/html/body/div"));
		WebElement drop=driver.findElement(By.xpath("/html/body/div[2]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		WebElement msg=driver.findElement(By.xpath("/html/body/div[2]/p"));
		System.out.println("msg :"+(msg.getText()));
		driver.close();
		
		
		
	}

}
