package ForInterview;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//windowHandle()
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();
		//System.out.println("Parent Window: "+parentHandle);
		
		//windowHandles()
		WebElement clickOnButton1 = driver.findElement(By.id("newWindowBtn"));
		clickOnButton1.click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String handle:handles) {
			//System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("it is another window");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				//driver.close();
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Back to home Page");
	}

}
