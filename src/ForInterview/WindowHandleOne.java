package ForInterview;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleOne {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
		email.sendKeys("Parent Windo");
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: "+parentWindow);
		
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		Set<String> otherWindow = driver.getWindowHandles();
		for(String window:otherWindow) {
			System.out.println("Other Window: "+window);
			driver.switchTo().window(window);
			driver.findElement(By.id("name")).sendKeys("other window");
			Thread.sleep(2000);
			
		}
		
		driver.switchTo().window(parentWindow);
		//driver.findElement(By.id("name")).sendKeys("Back to home Page");
	}

}
