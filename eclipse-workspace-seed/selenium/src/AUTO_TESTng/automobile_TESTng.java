package AUTO_TESTng;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class automobile_TESTng {
  @Test(dataProvider = "testdata")
  public void f(String engineperformance,String dateofmanufacture,String listprice,String licenseplatenumber,String annualmileage,String firstname,String lastname,
		  String birthdate,String add,String pin,String city,String web) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/");
		
		 System.out.println(driver.getCurrentUrl());
		  Actions action=new Actions(driver);
		  
		  WebElement automobile=driver.findElement(By.id("nav_automobile"));
			action.moveToElement(automobile).click().perform();
			Select courses=new Select(driver.findElement(By.id("make")));
			courses.selectByValue("Ford");
			
			driver.findElement(By.id("engineperformance")).sendKeys(engineperformance);
			driver.findElement(By.id("dateofmanufacture")).sendKeys(dateofmanufacture);
			
			Select numberofseats=new Select(driver.findElement(By.id("numberofseats")));
			numberofseats.selectByIndex(4);
			
			Select fuel1=new Select(driver.findElement(By.id("fuel")));
			fuel1.selectByValue("Diesel");
			
			driver.findElement(By.id("listprice")).sendKeys(listprice);
			
			driver.findElement(By.id("licenseplatenumber")).sendKeys(licenseplatenumber);
			
			
			
			driver.findElement(By.id("annualmileage")).sendKeys(annualmileage);
			
			WebElement nextenterinsurantdata  =driver.findElement(By.id("nextenterinsurantdata"));
			nextenterinsurantdata.click(); 
			
			driver.findElement(By.id("firstname")).sendKeys(firstname);
			
			driver.findElement(By.id("lastname")).sendKeys(lastname);
			
			driver.findElement(By.id("birthdate")).sendKeys(birthdate);
			
			WebElement male  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"));
			male.click();
			

			driver.findElement(By.id("streetaddress")).sendKeys(add);
			
			Select country=new Select(driver.findElement(By.id("country")));
			country.selectByValue("India");
			
			driver.findElement(By.id("zipcode")).sendKeys(pin);
			
			driver.findElement(By.id("city")).sendKeys(city);
			
			Select occupation=new Select(driver.findElement(By.id("occupation")));
			occupation.selectByValue("Farmer");
			
			WebElement speeding  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span"));
			speeding.click();
			WebElement bungee_jump  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]/span"));
			bungee_jump.click();
			WebElement cliff_driving  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]/span"));
			cliff_driving.click();
			WebElement skydriving  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]/span"));
			skydriving.click();
			WebElement other  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]/span"));
			other.click();
			
			driver.findElement(By.id("website")).sendKeys(web);  
			
			WebElement next =driver.findElement(By.id("nextenterproductdata"));
			next.click();
			/* WebElement prev =driver.findElement(By.id("preventervehicledata"));
			prev.click();  */
			
  }

  @DataProvider
  public Object[][] testdata() {
    return new Object[][] {
      new Object[] { "1234","01/01/2024", "510","100","1000","suhana","khan","01/09/2000","shewalewadi",
    		        "410503","Pune","https://sampleapp.tricentis.com/101/",},
      
    };
  }
}
