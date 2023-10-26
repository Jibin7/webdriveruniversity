package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
		Actions ac1 = new Actions(driver);
		WebElement link = driver.findElement(By.cssSelector("#double-click"));
		ac1.doubleClick(link).perform();
		
		Actions ac2 = new Actions(driver);
		WebElement live = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		ac2.moveToElement(live).build().perform();
		
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\\\"div-hover\\\"]/div[1]/div/a"));
		link1.click();
		
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
		
		
		
		

	}

}
