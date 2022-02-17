package ForInterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		//FindElement
		WebElement fromPlace = driver.findElement(By.id("fromPlaceName"));
		System.out.println(driver.getTitle());
		
		fromPlace.sendKeys("banga");
		
	
		List<WebElement> sugestion = driver.findElements(By.xpath("(//ul[@role = 'listbox'])[1]/li"));
	
		for(WebElement el:sugestion) {
		
			System.out.println(el.getText()+"***");
			
			
			}

	}

}
