import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement enablebtn=driver.findElement(By.id("enableAfter"));
		//enablebtn.click
		System.out.println("msg ;"+enablebtn.getText());
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
		
		WebElement visiblbtn=driver.findElement(By.id("visibleAfter"));
		System.out.println("msg :"+visiblbtn.getText());
		driver.close();
	}

}
