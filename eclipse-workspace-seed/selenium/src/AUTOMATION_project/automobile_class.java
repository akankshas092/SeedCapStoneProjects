package AUTOMATION_project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automobile_class {
int i,WebDriver ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/");
		
	    WebElement automobile=driver.findElement(By.id("nav_automobile"));
		automobile.click();
		for(int i=0;i<=15;i++)
		{
		Select courses=new Select(driver.findElement(By.id("make")));
		courses.selectByIndex(i);
		}
		
	    int i=1;
		if ( i>=1 & i<=2000)
	    {
		WebElement engineperformance  =driver.findElement(By.id("engineperformance"));
		engineperformance.click();
		engineperformance.sendKeys("200"+Keys.ENTER);
	    }
		
		WebElement date_ofmanufacture  =driver.findElement(By.id("dateofmanufacture"));
		date_ofmanufacture.click();
		date_ofmanufacture.sendKeys("10/05/2023"+Keys.ENTER);
		
		for( i=0;i<8;i++)
		{
		Select numberofseats=new Select(driver.findElement(By.id("numberofseats")));
		numberofseats.selectByIndex(i);
		}
		
		for( i=0;i<5;i++)
		{
		Select fuel=new Select(driver.findElement(By.id("fuel")));
		fuel.selectByIndex(i);
		}
		
		WebElement listprice  =driver.findElement(By.id("listprice"));
		listprice.click();
		listprice.sendKeys("507"+Keys.ENTER);
		
		
		WebElement licenseplatenumber  =driver.findElement(By.id("licenseplatenumber"));
		
		
		licenseplatenumber.click();
		licenseplatenumber.sendKeys("1001"+Keys.ENTER);
		
		WebElement annualmileage  =driver.findElement(By.id("annualmileage"));
		annualmileage.click();
		annualmileage.sendKeys("101"+Keys.ENTER);
		

		WebElement nextenterinsurantdata  =driver.findElement(By.id("nextenterinsurantdata"));
		nextenterinsurantdata.click();  
		
		//INTER INSURANCE DATA
		
		WebElement firstname  =driver.findElement(By.id("firstname"));
		firstname.click();
		firstname.sendKeys("amrita"+Keys.ENTER);
		
		WebElement lastname =driver.findElement(By.id("lastname"));
		lastname.click();
		lastname.sendKeys("singh"+Keys.ENTER);
		
		WebElement birthdate  =driver.findElement(By.id("birthdate"));
		birthdate.click();
		birthdate.sendKeys("10/05/1992"+Keys.ENTER);
		
		WebElement female  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[2]/span"));
		female.click();
		WebElement male  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span"));
		male.click();
		

		WebElement streetaddress  =driver.findElement(By.id("streetaddress"));
		streetaddress.click();
		streetaddress.sendKeys("shewalewadi,pune"+Keys.ENTER);
		
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByValue("India");
		
		WebElement zipcode  =driver.findElement(By.id("zipcode"));
		zipcode.click();
		zipcode.sendKeys("22345"+Keys.ENTER);
		
		WebElement city  =driver.findElement(By.id("city"));
		city.click();
		city.sendKeys("pune"+Keys.ENTER);
		
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
		
		WebElement website  =driver.findElement(By.id("website"));
		website.click();
		website.sendKeys("https://sampleapp.tricentis.com/101/"+Keys.ENTER);  
		
		WebElement next =driver.findElement(By.id("nextenterproductdata"));
		next.click();
		/* WebElement prev =driver.findElement(By.id("preventervehicledata"));
		prev.click();  */
		
		//ENTER PRODUCT DATA
		
		WebElement startdate  =driver.findElement(By.id("startdate"));
		startdate.click();
		startdate.sendKeys("12/12/2024"+Keys.ENTER);  
		
		for( i=0;i<=9;i++)
		{
		Select insurancesum=new Select(driver.findElement(By.id("insurancesum")));
		insurancesum.selectByIndex(i);
		}
		
		for( i=0;i<=18;i++)
		{
		Select meritrating=new Select(driver.findElement(By.id("meritrating")));
		meritrating.selectByIndex(i);
		}
		
		for( i=0;i<=2;i++)
		{
		Select damageinsurance=new Select(driver.findElement(By.id("damageinsurance")));
		damageinsurance.selectByIndex(i);
		}
		
		WebElement euro  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span"));
		euro.click();
		WebElement legal_defence_insurance  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span"));
		legal_defence_insurance.click();
		
		for(i=0;i<=2;i++)
		{
		Select courtesycar=new Select(driver.findElement(By.id("courtesycar")));
		courtesycar.selectByIndex(i);
		}
		
		
		WebElement next1 =driver.findElement(By.id("nextselectpriceoption"));
		next1.click();
		/* WebElement prev1 =driver.findElement(By.id("preventerinsurancedata"));
		prev1.click();  */
		
		
		WebElement silver  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span"));
		silver.click();
		
		
		/*	WebElement silverquote  =driver.findElement(By.className("fa fa-file-pdf-o"));
		silverquote.click();
		Set<String>windows1=driver.getWindowHandles();
		Iterator<String> r=windows1.iterator();
		String childwindow=r.next();
		driver.switchTo().window(childwindow);
		WebElement newtabmsg=driver.findElement(By.id("sampleHeading"));
		System.out.println("sample msg :"+newtabmsg.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		
		
		WebElement next2 =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]"));
		next2.click();
		
		
		/* WebElement prev2 =driver.findElement(By.id("preventerproductdata"));
		prev2.click();  */
		
		//SEND QUOTE
		
		WebElement email  =driver.findElement(By.id("email"));
		email.click();
		email.sendKeys("akanksha.singh092@gmail.com"+Keys.ENTER); 
		
		WebElement  phone =driver.findElement(By.id("phone"));
		phone.click();
		phone.sendKeys("14578954"+Keys.ENTER); 
		
		WebElement username =driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("saumya"+Keys.ENTER); 
		
		WebElement password  =driver.findElement(By.id("password"));
		password.click();
		password.sendKeys("A356ff34@"+Keys.ENTER); 
		
		WebElement confirmpassword  =driver.findElement(By.id("confirmpassword"));
		confirmpassword.click();
		confirmpassword.sendKeys("A356ff34@"+Keys.ENTER); 
		

		WebElement Comments   =driver.findElement(By.id("Comments"));
		Comments.click();
		Comments.sendKeys(" hi this is akanksha here i m doing automation testing with selenium"+Keys.ENTER); 
		
		WebElement send =driver.findElement(By.id("sendemail"));
		send.click();
		/* WebElement prev3  =driver.findElement(By.id("prevselectpriceoption"));
		prev3.click();  */
	
	
	// for GOLD INSURANCE
	
	/*WebElement gold  =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span"));
	gold.click();*/
		WebElement click_OK =driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button"));
		click_OK.click();
	}
}


