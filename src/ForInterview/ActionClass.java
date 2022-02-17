package ForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
		WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
		
		email.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
		
		
		//This is the third commnet or feature.
		
		// MouseHover 
		
		WebElement admin = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
		WebElement usermngt = driver.findElement(By.xpath("//a[contains(text(),'User Management')]"));
		WebElement user = driver.findElement(By.xpath("//a[@id = 'menu_admin_viewSystemUsers']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(admin).build().perform();
		action.moveToElement(usermngt).build().perform();
		action.moveToElement(user).click().build().perform();
		
		//action.moveToElement(user).moveToElement(usermngt).moveToElement(user).click().build().perform();
		
		
		

	}

}
