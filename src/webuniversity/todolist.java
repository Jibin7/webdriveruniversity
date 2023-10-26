package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class todolist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
	
		
		WebElement newtodo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		newtodo.sendKeys("hello");
		
		WebElement plus = driver.findElement(By.xpath("//*[@id=\"plus-icon\"]"));
		plus.click();
		

		WebElement del = driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[2]/span/i"));
		del.click();
		
		// TODO Auto-generated method stub

	}

}
