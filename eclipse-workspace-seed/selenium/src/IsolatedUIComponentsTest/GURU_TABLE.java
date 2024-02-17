package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GURU_TABLE {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demo.guru99.com/test/table.html");
		
		//print the table
		
		List<WebElement> numtable=driver.findElements(By.tagName("table"));
		int i=0;
		for(WebElement t:numtable)
		{
			System.out.println(t.getText());
			i++;
		}
		System.out.println("row number:"+(numtable.size()));
		System.out.println("i :"+i);
		
		
	// find the no of rows:	
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		 i=0;
		for(WebElement t:row)
		{
			System.out.println(t.getText());
			i++;
		}
	System.out.println("row number:"+(row.size()));
	System.out.println("i :"+i);
	
	
	//for finding no of each element
	List<WebElement> colno=driver.findElements(By.tagName("td"));
	 i=0;
	for(WebElement t:colno)
	{
		System.out.println(t.getText());
		i++;
	}

System.out.println("colum number:"+(colno.size()));
System.out.println("i :"+i);
	driver.close();
	
	}}

