package ForInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchLocator {
	
public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			WebElement fromPlace = driver.findElement(By.name("q"));
			fromPlace.sendKeys("banga");
			Thread.sleep(1000);
		
			List<WebElement> sugestion = driver.findElements(By.xpath("(//ul[@role = 'listbox'])[1]/li"));
		
			for(WebElement el:sugestion) {
			
				System.out.println(el.getText()+"***");
				
				if(el.getText().trim().equals("Bangalore"));
				el.click();
				break;
				}

	
	}
}
