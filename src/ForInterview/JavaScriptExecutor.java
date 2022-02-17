package ForInterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver; // we need to Cast driver as JavascriptExecutor 
		
		//Print the title
		String script = "return document.title;";
		String title = (String) jsExecutor.executeScript(script);
		System.out.println(title);
		
		jsExecutor.executeScript("document.getElementById('txtUsername').value='Admin'");
		jsExecutor.executeScript("document.getElementById('txtPassword').value='admin123'");
		jsExecutor.executeScript("document.getElementById('btnLogin').click();");
		 
		
		
		
		
	}

}
