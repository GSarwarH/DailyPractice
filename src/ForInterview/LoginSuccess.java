package ForInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSuccess {
	
	public static void main(String [] args) {
		
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
		
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();

		
		
		if(expectedTitle.equals(actualTitle)) {
			
			System.out.println("Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
			
		}
		
		
		
	}

}
