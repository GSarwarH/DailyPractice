package ForInterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyFromAmazon {
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//i[@class = 'hm-icon nav-sprite']"));
		element.click();
		
		WebElement moseOverKindle = driver.findElement(By.xpath("//a[@data-ref-tag = 'nav_em_1_1_1_8']"));
		moseOverKindle.click();
		
		WebElement clickKindle = driver.findElement(By.xpath("(//a[contains(text(),'Kindle')])[2]"));
		clickKindle.click();
		
		WebElement clickOnByNow = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		clickOnByNow.click();
		
		if( driver.findElement(By.xpath("//h1[contains(text(),'Sign-In')]")).isDisplayed()){

			System.out.println("You are in Sign-In page");

			}else{

			System.out.println("You are not in Sign-In page");

			}
		
		
		
		
	
		
		
				
	}

}
