package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DS_22MENU_SUBMENU {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.com/");
		
		//IDENTIFY MENU
		WebElement menu=driver.findElement(By.id("nav-link-accountList"));
		//OBJECT OF ACTION WITH METHOD movetoelement
		Actions act=new Actions(driver);
		act.moveToElement(menu).click().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		System.out.println("page navigated to :" +driver.getTitle());
		driver.close();
		

	}

}
