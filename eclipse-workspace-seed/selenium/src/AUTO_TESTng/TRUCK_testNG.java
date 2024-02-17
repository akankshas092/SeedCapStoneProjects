package AUTO_TESTng;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class TRUCK_testNG {
  @Test(dataProvider = "dp")
  public void f( String Engineperfm,String DOM,String num_of_seat,String fueltype, String payload, String totweight,String listprice,
		  String plate_no, String annual_milg, String firstname, String lastname, String DOB, String stadd, String zipcode, String city,
		  CharSequence startdate, CharSequence email, CharSequence phone, CharSequence username,
		  CharSequence password, CharSequence confirm_password, CharSequence comments) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/");
		
		 System.out.println(driver.getCurrentUrl());
		  Actions action=new Actions(driver);
		  
		  WebElement truck =driver.findElement(By.id("nav_truck"));
			action.moveToElement(truck).click().perform();
			
			Select Make=new Select(driver.findElement(By.id("make")));
			Make.selectByValue("Ford");
			
			driver.findElement(By.id("engineperformance")).sendKeys(Engineperfm);
			driver.findElement(By.id("dateofmanufacture")).sendKeys(DOM);
			driver.findElement(By.id("numberofseats")).sendKeys(num_of_seat);
			driver.findElement(By.id("fuel")).sendKeys(fueltype);
			driver.findElement(By.id("payload")).sendKeys(payload);
			driver.findElement(By.id("totalweight")).sendKeys(totweight);
			driver.findElement(By.id("listprice")).sendKeys(listprice);
			driver.findElement(By.id("licenseplatenumber")).sendKeys(plate_no);
			driver.findElement(By.id("annualmileage")).sendKeys(annual_milg);
			driver.findElement(By.id("nextenterinsurantdata")).click();
			
			driver.findElement(By.id("firstname")).sendKeys(firstname);
			driver.findElement(By.id("lastname")).sendKeys(lastname);
			driver.findElement(By.id("birthdate")).sendKeys(DOB);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span")).click();
			driver.findElement(By.id("streetaddress")).sendKeys(stadd);
			Select country=new Select(driver.findElement(By.id("country")));
			country.selectByValue("India");
			driver.findElement(By.id("zipcode")).sendKeys(zipcode);
			driver.findElement(By.id("city")).sendKeys(city);

			Select occupation=new Select(driver.findElement(By.id("occupation")));
			occupation.selectByValue("Public Official");
			
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
			driver.findElement(By.id("nextenterproductdata")).click();
			
			
			driver.findElement(By.id("startdate")).sendKeys(startdate);
			Select insurance_sum=new Select(driver.findElement(By.id("insurancesum")));
			insurance_sum.selectByValue("5000000");
			Select damageinsurance =new Select(driver.findElement(By.id("damageinsurance")));
			damageinsurance .selectByValue("Partial Coverage");
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[1]/span")).click();
			driver.findElement(By.id("nextselectpriceoption")).click();
			
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span")).click();
			driver.findElement(By.id("nextsendquote")).click();
			
			
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("phone")).sendKeys(phone);
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("confirmpassword")).sendKeys(confirm_password);
			driver.findElement(By.id("Comments")).sendKeys(comments);
			driver.findElement(By.id("sendemail")).click();
			
			driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
			
			
			
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"23","01/04/2024","4","Electric Power","6","500","688","5786",
    		  "300","amit","kumar","10/10/2000","shewalwadi,pune" ,"23432" ,"pune",
    		  "10/3/2024","xyz@gmail.com","3363454243","sarita","1234@Aa","1234@Aa","gydtdeyytr gfryfg rfryf"},
     
    };
  }
}
