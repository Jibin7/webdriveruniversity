package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageobjectmodel {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");
		driver.manage().window().maximize();
		
		
		WebElement rightarrow = driver.findElement(By.xpath("//*[@id=\"carousel-example-generic\"]/a[2]/span"));
		rightarrow.click();
		
		

		WebElement home = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a"));
		home.click();
		
		WebElement findoutmore = driver.findElement(By.xpath("//*[@id=\"button-find-out-more\"]/b"));
		findoutmore.click();
		driver.switchTo().alert().accept();
		
		
		WebElement close1 = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button[2]"));
		close1.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	WebElement products = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a"));
	//	products.click();
		
		//WebElement contact = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[3]/a"));
		//contact.click();
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
