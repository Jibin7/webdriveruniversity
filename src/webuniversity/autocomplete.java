package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.manage().window().maximize();
		
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		text.sendKeys("Almond");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		submit.click();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
