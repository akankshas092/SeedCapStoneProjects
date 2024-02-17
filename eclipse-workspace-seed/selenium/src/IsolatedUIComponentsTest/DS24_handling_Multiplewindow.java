package test1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DS24_handling_Multiplewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/browser-windows");
		
		WebElement newtab=driver.findElement(By.id("tabButton"));
		newtab.click();
		Set<String>windows1=driver.getWindowHandles();
		Iterator<String> i=windows1.iterator();
		String mainwindow=i.next();
		String childwindow=i.next();
		driver.switchTo().window(childwindow);
		
		WebElement newtabmsg=driver.findElement(By.id("sampleHeading"));
		System.out.println("sample msg :"+newtabmsg.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().window(mainwindow);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("button text :"+newtabmsg.getText());
		driver.quit();
		
		
			
		}

	}


