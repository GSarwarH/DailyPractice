package ForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pavantestingtools.com/");
		
		WebElement trainingLink = driver.findElement(By.xpath("//*[@id=\"menu-primary-items\"]/li[4]/a"));
		trainingLink.click();
		Thread.sleep(3000);
		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		trainingLink.click();
		
		// Handling the StaleElementReferenceException
		try {
			trainingLink.click();
		}
		catch(StaleElementReferenceException e) {
			
			trainingLink = driver.findElement(By.xpath("//*[@id=\"menu-primary-items\"]/li[4]/a"));
			trainingLink.click();
		}
		

	}

}
