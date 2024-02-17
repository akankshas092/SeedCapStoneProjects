package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DS_20manyclickbutton {

	public static void main(String[] args) {
		// TRY DOUBLE CLICK
		//RIGHT CLICK BUTTON
		//ONLY CLICK BUTTON
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/buttons");
		
		Actions act=new Actions(driver);
		
		// TRY DOUBLE CLICK
		WebElement doublclick=driver.findElement(By.id("doubleClickBtn"));//move cursor to doubleclick button
		act.moveToElement(doublclick).doubleClick().perform();           //perform doubleclick on button
		WebElement dublclikmsg=driver.findElement(By.id("doubleClickMessage"));  //get the msg after double click
		System.out.println("msg :"+(dublclikmsg.getText()));                    //print the msg after doubleclick//

		
		//RIGHT CLICK BUTTON//
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		act.moveToElement(rightclick).contextClick().perform();
		WebElement msg=driver.findElement(By.id("rightClickMessage"));
		System.out.println("msg :"+( msg.getText()));
		
		
		//ONLY CLICK BUTTON//
		WebElement singleclick=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
		act.moveToElement(singleclick).click().perform();
		WebElement clickmsg=driver.findElement(By.id("dynamicClickMessage"));
		System.out.println("msg :"+(clickmsg.getText()));
	
		
		driver.close();
	}

}
