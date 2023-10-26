package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buttonclicks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		
		
	/*	Actions ac1 = new Actions(driver);
		WebElement clicklink = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		ac1.doubleClick(clicklink).perform();
		driver.switchTo().alert().dismiss(); */
		
		Actions ac = new Actions(driver);
		WebElement clicklink1 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
		ac.doubleClick(clicklink1).perform();
		driver.switchTo().alert().accept();
		
		
		// TODO Auto-generated method stub

	}

}
