package ForInterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class IframeExample {
	
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		//driver.switchTo().frame("moneyiframe");//using id or name
		//driver.switchTo().frame(0);//using frame index number
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"moneyiframe\"]")));//using Xpath
		WebElement nse = driver.findElement(By.id("nseindex"));
		System.out.println(nse.getText());
		
		driver.switchTo().defaultContent();//focusing on parrent httml page
		
		WebElement sportTabs = driver.findElement(By.linkText("SPORTS"));
		sportTabs.click();
	}

}
