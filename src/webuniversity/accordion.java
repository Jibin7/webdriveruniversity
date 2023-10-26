package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class accordion {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		driver.manage().window().maximize();
		
		WebElement manual = driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
		manual.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e)  {
			e.printStackTrace();
			
		}
		WebElement manual1 = driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
		manual1.click();
				
				
		// TODO Auto-generated method stub

	}

}
