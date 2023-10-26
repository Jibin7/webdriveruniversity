package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginportal {

	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
		username.sendKeys("jibin111");
		
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123344");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		driver.switchTo().alert().dismiss();
		
		// TODO Auto-generated method stub

	}

}
