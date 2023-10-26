package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popupalert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		
		
		Actions ac1 = new Actions(driver);
		
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		link1.click();
		WebElement link2 = driver.findElement(By.xpath("//*[@id=\"button2\"]/p"));
		link2.click();
		// TODO Auto-generated method stub

	}

}
