package ForInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGeneration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		
		WebElement fromPlace = driver.findElement(By.id("fromPlaceName"));
		fromPlace.sendKeys("banga");
		Thread.sleep(1000);
	
		List<WebElement> sugestion = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	
		for(WebElement el:sugestion) {
		
			System.out.println(el.getText()+"****");
			
			if(el.getText().trim().equals("BANGALORE"));{
			el.click();
			break;
			}
			
		}
		
		
		
		
		

	}

}
