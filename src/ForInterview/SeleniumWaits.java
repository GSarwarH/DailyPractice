package ForInterview;

import java.awt.Color;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	
	private static final Function ExpecteConditions = null;

	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement mouseOverOnMotorTab = driver.findElement(By.xpath("(//a[contains(text(),'Motors')])[2]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mouseOverOnMotorTab).perform();
		
		//Explicit Wait
		WebDriverWait imlWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		imlWait.until(ExpectedConditions.titleContains("Electronics"));
		System.out.println(driver.getTitle());
		
			
		

		
		//Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Classics')]"))).click();
		
	}

	

}
