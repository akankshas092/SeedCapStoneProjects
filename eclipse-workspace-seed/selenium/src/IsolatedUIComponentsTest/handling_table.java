package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/akank/Desktop/table_test/table1.html");
		
		List<WebElement>age=driver.findElements(By.xpath("/html/body/table/tbody/tr/td[4]"));
		WebElement tp1=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[4]"));
		
		int max=Integer.parseInt(tp1.getText());
		for(WebElement th1:age)
			
		{
			if (max<Integer.parseInt(th1.getText()))
				max=Integer.parseInt(th1.getText());
			System.out.println(th1.getText());
		}
			System.out.println("max age:"+max);		
				
		
       
      // driver.close();
	}

}
