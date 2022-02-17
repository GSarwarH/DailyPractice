package ForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectStaticDropDown {
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);
		
		select.selectByValue("level1");
		Thread.sleep(5000);
		select.selectByVisibleText("51 - 100 employees");
		Thread.sleep(5000);
		select.selectByIndex(5);
		
	}

}
