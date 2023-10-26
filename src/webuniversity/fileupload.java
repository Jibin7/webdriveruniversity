package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		
		WebElement fileinput = driver.findElement(By.cssSelector("#myFile"));
		fileinput.sendKeys("C:\\Users\\user\\Downloads\\images1.png");
		WebElement sub = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		sub.click();
		driver.switchTo().alert().accept();
		
		
		try {
			Thread.sleep(5000);			
		}catch(InterruptedException e)  {
			e.printStackTrace();			
		}
		
		// TODO Auto-generated method stub

	}

}
