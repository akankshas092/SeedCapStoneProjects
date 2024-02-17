package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/akank/Desktop/table_test/table.html1.html");
		List<WebElement>table1=driver.findElements(By.xpath("/html/body/table"));
		for(WebElement tb1 : table1)
			System.out.println(tb1.getText());
		
		List<WebElement>price=driver.findElements(By.xpath("/html/body/table/tbody/tr/td[4]"));
		for(WebElement tb2 : price)
			System.out.println(tb2.getText());
		    driver.close();
		    
		    

	}

}
