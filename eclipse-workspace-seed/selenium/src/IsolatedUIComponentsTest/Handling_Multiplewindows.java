package test1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiplewindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.citibank.co.in/ibank/login/IQPin1.jsp?dOfferCode=PAYCCBILL");
		
		WebElement username=driver.findElement(By.id("User_Id"));
		username.sendKeys("rubina");
		//selecting radio button
		WebElement qpinradio=driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/input"));
		qpinradio.click();
		
		WebElement Qpin=driver.findElement(By.id("password"));
		Qpin.sendKeys("234@5");;
		

		WebElement newtab=driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div/div/span/a"));
		newtab.click();
		Set<String>windows1=driver.getWindowHandles();
		Iterator<String> i=windows1.iterator();
		String mainwindow=i.next();
		String childwindow=i.next();
		driver.switchTo().window(childwindow);
	}

}
