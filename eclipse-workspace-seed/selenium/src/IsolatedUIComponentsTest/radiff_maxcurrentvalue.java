package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiff_maxcurrentvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/sectors/bse/bse-cd");
		
		List<WebElement>heading=driver.findElements(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/table/thead/tr/th"));
		for(WebElement h:heading)
		
		System.out.println("heading :"+h.getText());
		System.out.println(" size of heading  :"+heading.size());
		
		List<WebElement> currentprice=driver.findElements(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/table/tbody/tr/td[3]"));
		System.out.println("column no :"+currentprice.size());
		WebElement m=driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div[2]/table/tbody/tr/td[3]"));
		float max=Float.parseFloat(m.getText());
		
		for (WebElement h :currentprice)
		{
			if(max< Float.parseFloat(h.getText()))
				max=Float.parseFloat(h.getText());
				
		}
		System.out.println("max price :"+max);
		driver.close();
		
	}}